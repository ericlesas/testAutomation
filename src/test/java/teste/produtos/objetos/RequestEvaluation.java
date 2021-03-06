package teste.produtos.objetos;

public class RequestEvaluation {

    public static String menuRequestEvaluationButton = "//a[@href=\"#/app/solicita\"]";
    public static String evaluationType = "//select[@ng-options=\"option.id as option.name disable when option.id == ctrl.VALUATION_TYPES_ENUM.C2B_DEFAULT for option in ctrl.$api.valuationTypes\"]";
    public static String chooseEvaluationType = "//option[@label=\"Somente compra\"]";
    public static String fillName = "//input[@ng-model=\"ctrl.valuation.name\"]";
    public static String fillEmail = "//input[@ng-model=\"ctrl.valuation.email\"]";
    public static String fillPhone = "//input[@ng-model=\"ctrl.valuation.phone_number\"]";
    public static String fillCellphone = "//input[@ng-model=\"ctrl.valuation.cell_phone\"]";
    public static String fillCRM = "//input[@ng-model=\"ctrl.valuation.crm\"]";
    public static String fillCEP = "//input[@ng-model=\"ctrl.valuation.zip\"]";
    public static String fillAddress = "//input[@ng-model=\"ctrl.valuation.address\"]";
    public static String fillAdressNumber = "//input[@ng-model=\"ctrl.valuation.n\"]";
    public static String fillAdressDetail = "//input[@ng-model=\"ctrl.valuation.address_details\"]";
    public static String fillNeighborhood = "//input[@ng-model=\"ctrl.valuation.town\"]";
    public static String fillVehicle = "//av-search-filter[@disabled=\"!ctrl.interest.year\"]" +
            "//input[@class=\"form-control av-search-filter ng-pristine ng-untouched ng-valid\"]";
    public static String plate = "//input[@ng-model=\"ctrl.valuation.plate\"]";
    public static String renavam = "//input[@ng-model=\"ctrl.valuation.renavam\"]";
    public static String seats = "//input[@ng-model=\"ctrl.valuation.seats\"]";
    public static String upholstery = "//input[@ng-model=\"ctrl.valuation.upholstery\"]";
    public static String engineNumber = "//input[@ng-model=\"ctrl.valuation.engine_number\"]";
    public static String power = "//input[@ng-model=\"ctrl.valuation.power\"]";
    public static String expectedValue= "//input[@ng-model=\"ctrl.valuation.expected_value\"]";
    public static String vehicleCity = "//av-search-filter[@model=\"ctrl.valuation.vehicle_city\"]" +
            "//input[@class=\"form-control av-search-filter ng-pristine ng-untouched ng-valid\"]";
    public static String clickObservations = "//div[@ng-click=\"ctrl.obsShow = !ctrl.obsShow\"]";
    public static String textObservations = "//textarea";
    public static String solicitationButton = "//div[@class=\"pull-right\"]//button[@ng-click=\"ctrl.solicita()\"]";
}
