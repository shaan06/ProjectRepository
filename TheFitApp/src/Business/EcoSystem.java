package Business;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.NewUser.CustomerDirectory;
import Business.Organization.Organization;
import Business.Role.Role;
import Business.Role.SystemAdminRole;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.AppointmentQueue;
import Business.WorkQueue.InventoryQueue;
import Business.WorkQueue.InventoryRequest;
import java.util.ArrayList;
import java.util.HashSet;

/**
 *
 * @author dell
 */
public class EcoSystem extends Organization {

    private static EcoSystem business;
    private ArrayList<Network> networkList;
    private CustomerDirectory cd;
    private AppointmentQueue apptQ;
    private InventoryQueue intQ;
    public static EcoSystem getInstance() {
        if (business == null) {
            business = new EcoSystem();
        }
        return business;
    }
    private EcoSystem() {
        super(null);
        networkList = new ArrayList<>();
        cd = new CustomerDirectory();
        apptQ = new AppointmentQueue();
        intQ= new InventoryQueue();
    }
    
    public InventoryQueue getIntQ() {
        return intQ;
    }

    public void setIntQ(InventoryQueue intQ) {
        this.intQ = intQ;
    }
    public ArrayList<Network> getNetworkList() {
        return networkList;
    }
    
    public static void setInstance(EcoSystem system) {
        business=system;
    }

    public AppointmentQueue getApptQ() {
        return apptQ;
    }

    public void setApptQ(AppointmentQueue apptQ) {
        this.apptQ = apptQ;
    }
    
    public CustomerDirectory getCd() {
        return cd;
    }

    public void setCd(CustomerDirectory cd) {
        this.cd = cd;
    }
        
    public Network createAndAddNetwork() {
        Network network = new Network();
        networkList.add(network);
        return network;
    }

    @Override
    public HashSet<Role> getSupportedRole() {
        roles.add(new SystemAdminRole());
        return roles;
    }

    public static boolean checkIfUsernameIsUnique(String username) {
        
        for (Network network : business.getNetworkList()) {
            for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
                for (UserAccount ua : enterprise.getUserAccountDirectory().getUserAccountList()) {
                    if(ua.getUsername().equals(username)){
                        return false;
                    }
                }
                for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
                    for (UserAccount ua : organization.getUserAccountDirectory().getUserAccountList()) {
                        if(ua.getUsername().equals(username)){
                            return false;
                        }
                    }
                }
            }
        }
        return true;
    }
    public Boolean cieNetwork(String name){
        for(Network ntwk : networkList){
            if(ntwk.getName().equalsIgnoreCase(name)){
                return true;
            }
        }
        return false;
    }
}