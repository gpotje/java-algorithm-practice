package org.example.java.n8.desafios_de_programacao.ex26;

import java.util.ArrayList;
import java.util.List;

public class NetworkManager {
    private List<Device> devices;



    public NetworkManager() {
        this.devices = new ArrayList<>();
    }

    public void addDevice(String name){
        devices.add(new Device(name));
    }

    public void connectDevices(String d1, String d2){

        int indexD1 = findDeviceByName(d1);
        int indexD2 = findDeviceByName(d2);

        if(indexD1 != -1){
            devices.get(indexD1).addDeviceConnected(d2);

        }
        if(indexD2 != -1){
            devices.get(indexD2).addDeviceConnected(d1);

        }

    }

    public void powerDevices(String d1){
        List<String> lp  = new ArrayList<>();
        lp.add(d1);

        while(!lp.isEmpty()){
            String current = lp.remove(0);
            int index  = findDeviceByName(current);

            if(index != -1 && !devices.get(index).isTurn()) {

                devices.get(index).setStatus(StatusDevice.ON);

                for (String connected : devices.get(index).getConnected()) {

                    int indexConnected = findDeviceByName(connected);
                    if (indexConnected != -1 &&
                            !devices.get(indexConnected).isTurn()) {
                        lp.add(connected);
                    }
                }

            }

        }
    }


    private int findDeviceByName(String name){
        for (int i = 0; i <= devices.size() -1 ; i++) {
            if(devices.get(i).getName().equals(name)){
                return i;
            }
        }
        return -1;
    }

    public String stringToList(){
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for(int i = 0; i <= devices.size() -1; i++){
            if(i == devices.size() -1){
                sb.append(devices.get(i).toString());
            }else {
                sb.append(devices.get(i).toString()+", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
