package HomeWork6_OOP.servise;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Objects;

import HomeWork6_OOP.model.Bar;
import HomeWork6_OOP.model.HotDrink;
import HomeWork6_OOP.repository.VendingMachineRepository;

public class VendingMachineImpl implements VendingMachine {
    List<String> productTypes = Arrays.asList("HotDrink", "Bar");

    @Override
    public List<String> getProductPriceList() {
        return VendingMachineRepository.productList.stream()
                .map(product -> product.getClass().getSimpleName() + " => " + Objects.toString(product)).toList();
    }

    @Override
    public void addProduct(String productType, Map<String, Object> productData) {
        switch (productType) {
            case "HotDrink":
                VendingMachineRepository.productList.add(new HotDrink(productData));
                break;
            case "Bar":
                VendingMachineRepository.productList.add(new Bar(productData));
                break;
            default:
                break;
        }
    }

    @Override
    public List<String> getProducts(Map<String, Object> matchPattern) {
        return VendingMachineRepository.productList.stream().filter(product -> product.isMatch(matchPattern))
                .map(product -> product.getClass().getSimpleName() + " => " + Objects.toString(product)).toList();

    }

    @Override
    public List<String> getProductTypes() {
        return productTypes;
    }

}
