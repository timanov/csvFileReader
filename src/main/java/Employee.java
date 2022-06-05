public class Employee {

    private int id;
    private String name;
    private String group;
    private String version;
    private String ip;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    @Override
    public String toString(){
        return "\nID=" + getId()
                + "::Name" + getName()
                + "::Group=" + getGroup()
                + "::Version=" + getVersion()
                + "::Ip=" + getIp();
    }
}
