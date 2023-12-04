package Testing;

import controller.KeranjangController;
import model.ModelKeranjang;
import node.NodeClass.NodeProduk;
import node.NodeClass.NodeUser;

import java.util.ArrayList;

public class KeranjangTest {
    public static void main(String[] args) {
        ArrayList<NodeProduk> lBarang = new ArrayList<>();
        ArrayList<NodeUser> lUser = new ArrayList<>();
        lUser.add(new NodeUser(1,"rehan","probasket","point"));
        lUser.add(new NodeUser(2,"halim","bangjago","poi"));
        NodeUser rehan = lUser.get(0);
        lBarang.add(new NodeProduk(1,"Wiskas",10000,"Makanan",10,rehan));
        lBarang.add(new NodeProduk(2,"Kentang",8000,"Makanan",10,rehan));
        lBarang.add(new NodeProduk(3,"Borgar",12000,"Makanan",10,rehan));
        KeranjangController tester = new KeranjangController(lBarang,lUser);
        tester.addKeranjang(1);
        tester.delKeranjang(0);
//        tester.addKeranjang(2);
//        tester.addProduk(1,"1-10,2-1");
//        tester.delProduk(1,2);
    }

    public static void testModel(ArrayList<NodeProduk> lBarang) {
        NodeUser revel = new NodeUser(1,"rehan","probasket","point");
        ModelKeranjang mKer = new ModelKeranjang(lBarang);
//        for (NodeProduk p: mKer.barangGlobal) {
//            System.out.println("id produk "+p.getId_barang());
//        }
        System.out.println("status add keranjang "+(mKer.addKeranjang(revel)));
//        System.out.println("size listkeranjang "+mKer.listKeranjang.size());
        System.out.println("size listBarang di id 1 "+mKer.searchIdKeranjang(1).listBarang.size());
//        System.out.println("status add barang "+mKer.addBarang(1,"1-10"));
        System.out.println("status del barang "+mKer.delBarang(10,1));
    }
}
