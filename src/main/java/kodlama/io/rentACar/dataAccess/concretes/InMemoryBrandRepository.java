//package kodlama.io.rentACar.dataAccess.concretes;
//
//import kodlama.io.rentACar.dataAccess.abstracts.BrandRepository;
//import kodlama.io.rentACar.entities.concretes.Brand;
//import org.springframework.stereotype.Repository;
//
//import java.util.ArrayList;
//import java.util.List;
//
//@Repository // -> that class is dataAccess Object
//public class InMemoryBrandRepository implements BrandRepository {
//    List<Brand> brands;
//
//    public InMemoryBrandRepository() {
//        brands = new ArrayList<Brand>();
//        brands.add(new Brand(0,"Audi"));
//        brands.add(new Brand(1,"BMW"));
//        brands.add(new Brand(2,"Bugatti"));
//        brands.add(new Brand(3,"Fiat"));
//        brands.add(new Brand(4,"Mercedes"));
//    }
//
//    @Override
//    public List<Brand> getAll() {
//        return brands;
//    }
//}
