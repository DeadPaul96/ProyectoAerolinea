
package com.mycompany.proyectofinalds;

public class IDTicket {
    private String iduser;
    private String idticket;

    public IDTicket(String iduser, String idticket) {
        this.iduser = iduser;
        this.idticket = idticket;
    }

    public String getIduser() {
        return iduser;
    }

    public void setIduser(String iduser) {
        this.iduser = iduser;
    }

    public String getIdticket() {
        return idticket;
    }

    public void setIdticket(String idticket) {
        this.idticket = idticket;
    }
}
