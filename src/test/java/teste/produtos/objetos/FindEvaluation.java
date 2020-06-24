package teste.produtos.objetos;

public class FindEvaluation {

    public static String evaluationButton = "//a[@ng-click=\"sc.toggleCollapseKey('app.avaliacoes')\"]";
    public static String subEvaluationButton = "//a[@ui-sref=\"app.avaliacoes.lista({modus:'lista'})\"]";
    public static String filterByAll = "//select[@ng-options=\"option.id as option.name for option in ctrl.filtersData.status\"]//option[contains(text(),\"Todos\")]";
    public static String openEvaluation = "//img[@ng-src=\"https://storage.googleapis.com/photo-ecossistema/originals/usbi/1_1_546143_1.jpg\"]";
    public static String printButton = "//button[@ng-show=\"$root.checkRoot('usbi:valuation:print')\"]";
}
