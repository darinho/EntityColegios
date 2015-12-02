/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.entities;

/**
 *
 * @author dario.calderon
 */
public enum Status {

    A("Disponible", "Available"),
    U("Usado", "Used");

    private final String code;
    private final String name;

    Status(String name, String code) {
        this.name = name;
        this.code = code;
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

}
