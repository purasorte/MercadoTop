package Event;

import javax.swing.JTable;

public class UpdateUI implements EventListener {
    private String msg;
    private JTable jTable;
    
    public UpdateUI(String msg, JTable jTable) {
        this.msg = msg;
        this.jTable = jTable;
    }

    @Override
    public void update(String eventType) {
        System.out.println("Passou em: " + eventType);
    }
}
