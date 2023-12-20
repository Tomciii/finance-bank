package common.dto;

public class SharesDTO {

    private DepotDTO depot;

    private String stockName;

    private int stockShares;

    public SharesDTO(DepotDTO depot, String stockName, int stockShares) {
        this.depot = depot;
        this.stockName = stockName;
        this.stockShares = stockShares;
    }

    public SharesDTO() {

    }

    public DepotDTO getDepot() {
        return depot;
    }

    public void setDepot(DepotDTO depot) {
        this.depot = depot;
    }

    public String getStockName() {
        return stockName;
    }

    public void setStockName(String stockName) {
        this.stockName = stockName;
    }

    public int getStockShares() {
        return stockShares;
    }

    public void setStockShares(int stockShares) {
        this.stockShares = stockShares;
    }

    @Override
    public String toString() {
        return "SharesDTO{" +
                "depot=" + depot +
                ", stockName='" + stockName + '\'' +
                ", stockShares=" + stockShares +
                '}';
    }
}
