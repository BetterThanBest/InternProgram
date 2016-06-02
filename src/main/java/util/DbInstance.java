package util;

public class DbInstance 
{
    private String id;
    private String instanceName;
    private String SQLCmd;
    
    public DbInstance() {
        super();
        this.id = null;
        this.instanceName = null;
        this.SQLCmd = null;
    }
    
    public DbInstance(String id, String instanceName, String sQLCmd) {
        super();
        this.id = id;
        this.instanceName = instanceName;
        this.SQLCmd = sQLCmd;
    }
    
    public String getId() {
        return id;
    }
    
    public void setId(String id) {
        this.id = id;
    }
    
    public String getInstanceName() {
        return instanceName;
    }
    public void setInstanceName(String instanceName) {
        this.instanceName = instanceName;
    }
    public String getSQLCmd() {
        return SQLCmd;
    }
    public void setSQLCmd(String sQLCmd) {
        SQLCmd = sQLCmd;
    }
}
