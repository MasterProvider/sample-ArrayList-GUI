/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectwif;

/**
 *
 * @author Eric
 */
public class ModelWifi {
    
    private String ssid;
    private String ip;
    private String bssid;
    private String iconName;
 
    public ModelWifi(String ssid, String ip,String bssid, String iconName) {
        super();
        this.ssid = ssid;
        this.ip = ip;
         this.bssid = bssid;
        this.iconName = iconName;
    }
 
    public String getSSID() {
        return ssid;
    }
 
    public void setSSID(String ssid) {
        this.ssid = ssid;
    }
 
    
    
    public String getIP() {
        return ip;
    }
 
    public void setIP(String ip) {
        this.ip = ip;
    }
 
    
    public String getBSSID() {
        return bssid;
    }
 
    public void setSBSID(String bssid) {
        this.bssid = bssid;
    }
    
    
    
    public String getIconName() {
        return iconName;
    }
 
    public void setIconName(String iconName) {
        this.iconName = iconName;
    }
    
    
    @Override
public String toString() {
    return ssid + " - " + ip;
}
}
