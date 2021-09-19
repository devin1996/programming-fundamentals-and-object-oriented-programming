/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observerPattern;

import java.util.Observable;
import java.util.Observer;

/**
 *
 * @author DEVIN
 */
public class NameObserver implements Observer {
    private String name;
public NameObserver() {
name = null;
System.out.println("NameObserver created: Name is " + name);
}
public void update(Observable obj, Object arg) {
if (arg instanceof String) {
name = (String)arg;
System.out.println("NameObserver: Name changed to " + name);
} else {
System.out.println("NameObserver: Some other change to subject!");
}
}

}
