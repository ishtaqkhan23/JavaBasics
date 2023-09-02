package javabasics.immutable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class Doctor {


    private final Long id;

    private final String name;

    private final String email;

    private final List<String> degrees;

    private final Map<String, String> toolKit;

    public Doctor(Long id, String name, String email, List<String> degrees, Map<String, String> toolKit) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.degrees = new ArrayList<>(degrees);
//        Map<String, String> tempMap= new HashMap<>();
//        for(Map.Entry<String, String> entry: toolKit.entrySet()){
//            tempMap.put(entry.getKey(), entry.getValue());
//        }
        this.toolKit = new HashMap<>(toolKit);
    }

    public Long getId() {
        return id;
    }


    public String getName() {
        return name;
    }


    public String getEmail() {
        return email;
    }

    public List<String> getDegrees() {
        return new ArrayList<>(degrees);
    }

    public Map<String, String> getToolKit() {
        return new HashMap<>(toolKit);
    }

    @Override
    public String toString() {
        return "Doctor{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", degrees=" + degrees +
                ", toolKit=" + toolKit +
                '}';
    }

    public static void main(String[] args) {
        List<String> docDegrees = new ArrayList<>();
        docDegrees.add("MBBS");
        docDegrees.add("MS");

        Map<String, String> map = new HashMap<>();
        map.put("aa", "aa");
        Doctor doctor = new Doctor(1l, "nawaz", "ee@gmail.com", docDegrees, map);
        System.out.println(doctor);

        // modifying the list should not result in modifying the doctor degrees
        docDegrees.add("Ortho");//directly modifying to the list object
        doctor.getDegrees().add("Ortho");// getting a degrees from doctor and then modyfing

        // modifying the map should not result in modifying the doctor toolKit
        map.put("bb", "bb");//directly modifying to the map object
        doctor.getToolKit().put("bb","bb");//getting a degrees from doctor and then modifying

        System.out.println(doctor);
    }
}
