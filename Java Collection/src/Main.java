import java.util.*;

public class Main {

    public static void main(String[] args) {
        List<String> namaBuah = new ArrayList<>();
        namaBuah.add("Mangga");
        namaBuah.add("Durian");
        namaBuah.add("Semangka");

        Set<String> warna = new HashSet<>();
        warna.add("Biru");
        warna.add("Hitam");
        warna.add("Ungu");

        Map<String, Integer> mahasiswa = new HashMap<>();
        mahasiswa.put("Faris", 16);
        mahasiswa.put("Dewaanga", 17);
        mahasiswa.put("Refan", 18);

        List<Object> gabunganListSet = new ArrayList<>();
        gabunganListSet.addAll(namaBuah);
        gabunganListSet.addAll(warna);

        System.out.println("Gabungan List dan Set:");
        for (Object element : gabunganListSet) {
            System.out.println(element);
        }

        Map<String, Object> gabunganMap = new HashMap<>();
        gabunganMap.putAll(mahasiswa);
        gabunganMap.put("Daftar Buah", gabunganListSet);

        System.out.println("\nGabungan Map:");
        for (Map.Entry<String, Object> entry : gabunganMap.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
