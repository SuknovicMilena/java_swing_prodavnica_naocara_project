/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package response;

import java.io.Serializable;
import util.OdgovorStatus;



public class OdgovorObjekat implements Serializable {

    private OdgovorStatus responseStatus;
    private String message;
    private Object response;

    public OdgovorObjekat() {
    }

    public OdgovorObjekat(OdgovorStatus responseStatus, String message, Object response) {
        this.responseStatus = responseStatus;
        this.message = message;
        this.response = response;
    }

   

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public OdgovorStatus getResponseStatus() {
        return responseStatus;
    }

    public void setResponseStatus(OdgovorStatus responseStatus) {
        this.responseStatus = responseStatus;
    }

    public Object getResponse() {
        return response;
    }

    public void setResponse(Object response) {
        this.response = response;
    }
    
}
