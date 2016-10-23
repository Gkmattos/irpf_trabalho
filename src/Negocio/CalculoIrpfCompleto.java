package Negocio;

public class CalculoIrpfCompleto implements CalculoIrpf {
	Contribuinte cont;
	 double  baseCalculo = cont.getTotRend()- cont.getContrPrev();
	 double taxaDescDep=0;
	 	
	@Override
	public double calculoImposto(Contribuinte cont) {
	
		 if(cont.getIdade()<65)
		 {
			 if(cont.getNroDep()>0 && cont.getNroDep()<3)
			 {
				 taxaDescDep=0.02;
			 }else if (cont.getNroDep()>=3 && cont.getNroDep()<6)
			 {
				 taxaDescDep=0.035;
			 }else if(cont.getNroDep()>5)
			 {
				 taxaDescDep=0.05;
			 }
		 }else 
		 {
			 if(cont.getNroDep()>=1 && cont.getNroDep()<3 )
			 {
				 taxaDescDep=0.03;
				 
			 }
			 else if(cont.getNroDep()>=3 && cont.getNroDep()<6)
			 {
				 taxaDescDep=0.045;
			 }else if(cont.getNroDep()>=6)
			 {
				 taxaDescDep=0.06;
			 }
			 return calculoBase();
		 }
		return baseCalculo;
	
	}
	
	private double calculoBase()
	{ 
	double descDep = baseCalculo * taxaDescDep;
    baseCalculo = baseCalculo - descDep;
    double impPagar;
    if (baseCalculo <= 12000.0) {
        impPagar = 0;
    } else if ((baseCalculo >= 12000.0) && (baseCalculo < 24000.0)) {
        impPagar = (baseCalculo - 12000.0) * 0.15;
    } else {
        double p1 = (23999.0 - 12000.0) * 0.15;
        double p2 = (baseCalculo - 23999.0) * 0.275;
        impPagar = p1 + p2;
    }
    return (impPagar);
		
	}
	 private double calculoSimplifica(Contribuinte c) {
	        double baseDeCalculo = c.getTotRend() - c.getContrPrev();
	        double descPadrao = baseDeCalculo * 0.5;
	        baseDeCalculo = baseDeCalculo - descPadrao;
	        double impPagar;
	        if (baseDeCalculo <= 12000.0) {
	            impPagar = 0;
	        } else if ((baseDeCalculo >= 12000.0) && (baseDeCalculo < 24000.0)) {
	            impPagar = (baseDeCalculo - 12000.0) * 0.15;
	        } else {
	            double p1 = (23999.0 - 12000.0) * 0.15;
	            double p2 = (baseDeCalculo - 23999.0) * 0.275;
	            impPagar = p1 + p2;
	        }
	        return (impPagar);
	    }

}
