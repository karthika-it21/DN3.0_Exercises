public class StockMarketMonitorTest {
    public static void main(String[] args) {
        StockMarket stockMarket = new StockMarket();

        Observer mobileApp = new MobileApp();
        Observer webApp = new WebApp();

        stockMarket.register(mobileApp);
        stockMarket.register(webApp);

        stockMarket.setPrice(100.00);
        stockMarket.setPrice(105.50);
    }
}
