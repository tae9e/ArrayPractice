package com.example.codePractice.fruitArray;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FruitController {
    //생성자 주입(외부에서 객체를 받아서 사용)
    private final FruitService fruitService;

    //하나만 생성할 땐 @Autowired 생략
    public FruitController(FruitService fruitService) {
        this.fruitService = fruitService;
    }

    //fruit?fruit=Apple&fruit=Banana&fruit=Cherry
    @GetMapping("/fruit")
    public String fruit(@RequestParam("fruit") String[] fruits){
        return fruitService.Fruit(fruits);
    }

    @GetMapping("/index")
    public String index(@RequestParam("nums") String[] nums) {
        return fruitService.index(nums);
    }

    //http://localhost:8080/selectFruit?selectNum=2&selectNum=5&selectFruit=사과&selectFruit=귤
    @GetMapping("/selectFruit")
    public String selectFruit(@RequestParam("selectNum") String[] selectNum, @RequestParam("selectFruit") String[] selectFruit){
        return fruitService.combine2(selectNum,selectFruit);
    }

    @GetMapping("/oddNumber")
    public String oddNumber(@RequestParam("selectNum") String[] selectNum, @RequestParam("selectFruit") String[] selectFruit){
        return fruitService.combine3(selectNum,selectFruit);
    }



    @GetMapping("/combinefruits")
    public String combine(@RequestParam("indexs") String[] indexs, @RequestParam("fruits") String[] fruits) {
        return fruitService.combineIndexFruit(indexs, fruits);
    }

    @GetMapping("/indexFruits")
    public String indexFruit(@RequestParam("userIndexs") String[] userIndexs, @RequestParam("fruits") String[] fruits) {
        return fruitService.indexes(userIndexs, fruits);
    }
}
