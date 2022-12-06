package com.babu;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Convert2DArrayToMap {

	public static void main(String[] args) {
		String[][] sheetMap = { /* XSD Name,  XSL Sheet Name */
                {"FileHeader", "FileHeader"}, 
                {"AccountRecord", "AccountRecord"}, 
                {"DriverCardRecord", "DriverCardRecord"}, 
                {"FileHeader", "Record"},
                {"SiteCardRecord", "SiteCardRecord"}
              };
		
		Map<String, String> finalMap = Arrays.stream(sheetMap).collect(Collectors.toMap(k  -> k[0], v -> v[1], (oldV, newV) -> newV));

		System.out.println(finalMap);
		
		/*
		 * Map<String, String> m = Arrays.stream(sheetMap) .collect(Collectors.toMap( kv
		 * -> kv[0], kv -> kv[1], (oldV, newV) -> newV) );
		 * 
		 * System.out.println(m);
		 */
		
		// other way
		//Map<String, String> fMap = convert2DArrayToMap(sheetMap);
		//System.out.println(fMap);
		
	}
	
	public static Map<String, String> convert2DArrayToMap(String[][] data)
	  {
	    Map<String, String> map = new HashMap<>();
	    for (String[] m : data)
	    {
	      if (map.put(m[0], m[1]) != null)
	      {
	    	  //map.remove(m[0]); // if you want to remove entire element/object itself use this
	    	  map.replace(m[0], map.get(m[0])); // if you want to remove the duplicate keys use this
	        //throw new IllegalStateException("Duplicate key"); // if you want to throw ex if duplicate keys found
	      }
	    }
	    return map;
	  }

}
