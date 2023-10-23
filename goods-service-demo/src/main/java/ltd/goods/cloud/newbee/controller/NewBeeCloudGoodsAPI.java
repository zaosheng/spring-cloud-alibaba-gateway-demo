
package ltd.goods.cloud.newbee.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NewBeeCloudGoodsAPI {

    @Value("${server.port}")
    private String applicationServerPort;// 读取当前应用的启动端口

    @GetMapping("/goods")
    public String goodsDetail2(@RequestParam("goodsId") int goodsId) {
        // 根据id查询商品并返回给调用端
        if (goodsId < 1 || goodsId > 100000) {
            return "查询商品为空，当前服务的端口号为" + applicationServerPort;
        }
        String goodsName = "商品" + goodsId;
        // 返回信息给调用端
        return goodsName + "，当前服务的端口号为" + applicationServerPort;
    }

    @GetMapping("/goods/page/{pageNum}")
    public String goodsList(@PathVariable("pageNum") int pageNum) {
        // 返回信息给调用端
        return  "请求goodsList，当前服务的端口号为" + applicationServerPort;
    }

}