package codigo;

public class Mutante {
       
	    
		private String[] dna= new String[6];
		
		public Mutante(String[] dna)
		{
		   this.dna = dna;
		}
		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((dna == null) ? 0 : dna.hashCode());
			return result;
		}
		@Override
		public boolean equals(Object obj) {
			

			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Mutante other = (Mutante) obj;
			if (dna == null) {
				if (other.dna != null)
					return false;
			} 
			return true;
		}
		
		public boolean esMutante(String[] dna)
		 {
            int cont=0;
		    for(int i=1; i<dna.length-1;++i)
		    {         
		    	if (dna[i].charAt(i)==dna[i+1].charAt(i) || dna[i].charAt(i)==dna[i].charAt(i+1)) 
		    	{
		    	   	cont++; 
		        }
		    }
		    if (cont==4) {
		    		 return true;
		    		 }
		    else
		    	
		    	   return false;
		    }
		
		public String[] getDna() {
			return dna;
		}
		public void setDna(String[] dna) {
			this.dna = dna;
		}
		@Override
		public String toString() {
			return "Secuencia DNA: [dna=" + dna + "]";
		}


}

