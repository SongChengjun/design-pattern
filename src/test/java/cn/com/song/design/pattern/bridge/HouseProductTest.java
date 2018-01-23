package cn.com.song.design.pattern.bridge;

import org.junit.Test;

public class HouseProductTest {
    @Test
    public void makeMoney() throws Exception {
        HouseProduct houseProduct = new HouseProduct();
        IpodProduct ipodProduct = new IpodProduct();

        HouseCorp houseCorp = new HouseCorp(houseProduct);
        houseCorp.makeMoney();

        ShanzaiCorp shanzaiCorp = new ShanzaiCorp(ipodProduct);
        shanzaiCorp.makeMoney();

    }

}