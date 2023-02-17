
package examen1_oliveriraheta;


public class PC {
    private String ip,mask,hostname;

    public PC() {
    }

    public PC(String ip, String mask, String hostname) {
        this.ip = ip;
        this.mask = mask;
        this.hostname = hostname;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getMask() {
        return mask;
    }

    public void setMask(String mask) {
        this.mask = mask;
    }

    public String getHostname() {
        return hostname;
    }

    public void setHostname(String hostname) {
        this.hostname = hostname;
    }

    @Override
    public String toString() {
        return "Hostname : " + hostname 
                + "\nIP : " + ip 
                + "\n Mask : " + mask  ;
    }
    
}
