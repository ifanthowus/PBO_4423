import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import javax.swing.UIManager;

public class formSederhana {
    private JPanel mainWindow;
    private JLabel windowName;
    private JLabel namaMhs;
    private JLabel prodiMhs;
    private JLabel nimMahasiswa;
    private JTextField fieldNama;
    private JComboBox pilihanProdi;
    private JTextField fieldNIM;
    private JButton resetButton;
    private JButton kirimButton;

    public formSederhana() {
        //ketika tombol "Reset " ditekan,
        //akan menghapus isi dari semua field yang ada
        resetButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                fieldNama.setText(null);
                fieldNIM.setText(null);
                pilihanProdi.setSelectedIndex(0);

            }
        });
    }

    /*method main akan menjalankan window/frame yang kita punya
    * bagian ini di generate secara otamatis
    * langkah-langkahnya:
    * 1) klik Alt + Insert
    * 2) pilih form main()*/
    public static void main(String[] args) throws Exception {
        //look and feel
        //langkah 1: download look and feel dalam bentuk jar
        //langkah 2: paste .jar tersebut ke folder src
        //langkah 3: klik kanan pada folder projectnya, kemudian pilih "Open Module Setting"
        //langkah 4: pada bagian libraries, tambahkan file .jar tadi
        //langkah 5: kemudian apply, lalu ok
        //catatan: string di dalam setLookAndFeel mengambil dari ketentuan di
        //website tempat downloadnya
        try {
            UIManager.setLookAndFeel("com.formdev.flatlaf.FlatDarkLaf");
        }catch (Exception e){

        }
        //menjalankan window
        JFrame frame = new JFrame("formSederhana");
        frame.setContentPane(new formSederhana().mainWindow);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
