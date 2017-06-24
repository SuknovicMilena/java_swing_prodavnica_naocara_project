/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package request;

import java.io.Serializable;


public class ZahtevObjekat implements Serializable {

    private int action;
    private Object request;
    private Object parameter;

    public ZahtevObjekat() {
    }

    public ZahtevObjekat(int action, Object param, Object parameter) {
        this.action = action;
        this.request = param;
        this.parameter = parameter;
    }

    public Object getRequest() {
        return request;
    }

    public void setRequest(Object request) {
        this.request = request;
    }

    public int getAction() {
        return action;
    }

    public void setAction(int action) {
        this.action = action;
    }

    public Object getParameter() {
        return parameter;
    }

    public void setParameter(Object parameter) {
        this.parameter = parameter;
    }

}
