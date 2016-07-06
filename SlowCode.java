public class SlowCode {

    private static int getValue(String generated, int x, int c) {

	if (generated.length() != 2000 ) {
	    generated += "!";
	} else {
	    c = x - 1;
	}
	int val2 = -1;
	// System.out.println("x = " + x + " c = " + c);
	if (x == ++c) {
	    val2 += x;
	    return val2;
	} else {
	    return getValue(generated, x, c);
	}
    }

    
    public static void main(String[] args) {
	System.out.print("Loading...");
	try {
	    // Modify this value to increase loading time
	    // (in ms)
	    Thread.sleep(10000);
	} catch (Exception lolex) {
	    // We're living on the edge
	}
	System.out.println("DONE!");
        if (args.length != 1) {
	    System.out.println("Just one argument, buddy!");
	    System.exit(1);
	}

	int val = getValue("", Integer.parseInt(args[0]), 0);;

	Other o = new Other(val);

	Prefacer.preface(3000);
	
	System.out.println(Prefacer.nirp.substring(0,1000));
	
	System.out.println("Statistics of value " + val + ":");
	System.out.println("Chirpy Number? " + Chirp.isChirpy(val));
	System.out.println("Nirpy Number? " + Chirp.isNirpy(val));
	System.out.println("Schnirpiness Level " + Chirp.schnirpyLevel(val));
	System.out.println("Threat Level: " + o.threatLevel(val));
	System.out.println("DEFCON: " + o.defcon(val));
    }
}
