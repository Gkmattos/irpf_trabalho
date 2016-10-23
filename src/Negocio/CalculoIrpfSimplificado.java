package Negocio;

public class CalculoIrpfSimplificado implements CalculoIrpf {

	@Override
	public double calculoImposto(Contribuinte c) {
		 double baseCalculo = c.getTotRend() - c.getContrPrev();
	        double DesPadrao = baseCalculo * 0.5;
	        baseCalculo = baseCalculo - DesPadrao;
	        double impostoPag;
	        if (baseCalculo <= 12000.0) {
	            impostoPag = 0;
	        } else if ((baseCalculo >= 12000.0) && (baseCalculo < 24000.0)) {
	            impostoPag = (baseCalculo - 12000.0) * 0.15;
	        } else {
	            double p1 = (23999.0 - 12000.0) * 0.15;
	            double p2 = (baseCalculo - 23999.0) * 0.275;
	            impostoPag = p1 + p2;
	        }
	        return (impostoPag);
	}

}
