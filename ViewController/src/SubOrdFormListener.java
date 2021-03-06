import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

import java.util.Date;

import oracle.adf.model.BindingContext;
import oracle.adf.view.rich.component.rich.input.RichInputText;
import oracle.adf.view.rich.event.DialogEvent;

import oracle.binding.BindingContainer;
import oracle.binding.OperationBinding;

public class SubOrdFormListener {
    Connection connection;
    private RichInputText formID;

    public SubOrdFormListener() {
    }

    public void submitSubOrdForm(DialogEvent dialogEvent) {
        // Add event code here...
        if (dialogEvent.getOutcome() == DialogEvent.Outcome.yes) {
            System.out.println("in the dialog method");
            BindingContainer bindings = getBindings();
            OperationBinding operationBinding1 =
                bindings.getOperationBinding("Commit");
            operationBinding1.execute();
            try {
                
                DateFormat df = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
                Date date = new Date();
                String date1 = new Date().toGMTString();
                String token[] = date1.split(" ");
                String actuallDate =
                    token[0] + "-" + token[1] + "-" + token[2];
                
                
                Class.forName("oracle.jdbc.driver.OracleDriver");
                //CREATING THE CONNECTION
                connection =
                        DriverManager.getConnection("jdbc:oracle:thin:@192.168.0.31:1522:prod",
                                                    "apps", "mskiz145");
                PreparedStatement preparedStatement =
                    connection.prepareStatement("update xx_sub_ord_ap_form_v2 set posted = ? , SUBMITION_DATE = ? where form_id = ?");
                preparedStatement.setString(1, "YES");
                preparedStatement.setString(2, actuallDate);
                preparedStatement.setInt(3,
                                         Integer.parseInt(formID.getValue().toString()));
                int id = preparedStatement.executeUpdate();
                OperationBinding operationBinding =
                    bindings.getOperationBinding("refreshSubordFormData");
                Object result = operationBinding.execute();


                System.out.println("id : " + id);
            } catch (Exception ex) {
                ex.printStackTrace();
            } finally {
                try {
                    connection.close();
                } catch (Exception ex) {
                    ex.printStackTrace();
                }

            }
        }
        
    }

    public BindingContainer getBindings() {
        return BindingContext.getCurrent().getCurrentBindingsEntry();
    }

    public void setFormID(RichInputText formID) {
        this.formID = formID;
    }

    public RichInputText getFormID() {
        return formID;
    }
}
