package de.doofmars.whattsap.parser;

import java.util.*;

/**
 * Transformation of maps
 * 
 * @author Jan
 *
 */
public class MapUtil
{
    public static <K, V extends Comparable<? super V>> Map<K, V> sortByValueAsc( Map<K, V> map ){
        List<Map.Entry<K, V>> list =
            new LinkedList<Map.Entry<K, V>>( map.entrySet() );
        Collections.sort( list, new Comparator<Map.Entry<K, V>>() {
            public int compare( Map.Entry<K, V> o1, Map.Entry<K, V> o2 ) {
                return (o1.getValue()).compareTo( o2.getValue() );
            }
        } );

        Map<K, V> result = new LinkedHashMap<K, V>();
        for (Map.Entry<K, V> entry : list)
        {
            result.put( entry.getKey(), entry.getValue() );
        }
        return result;
    }

    public static <K, V extends Comparable<? super V>> Map<K, V> sortByValueDsc( Map<K, V> map ){
    	List<Map.Entry<K, V>> list =
    			new LinkedList<Map.Entry<K, V>>( map.entrySet() );
    	Collections.sort( list, new Comparator<Map.Entry<K, V>>(){
    		public int compare( Map.Entry<K, V> o2, Map.Entry<K, V> o1 ){
    			return (o1.getValue()).compareTo( o2.getValue() );
    		}
    			} );
    	
    	Map<K, V> result = new LinkedHashMap<K, V>();
    	for (Map.Entry<K, V> entry : list)
    	{
    		result.put( entry.getKey(), entry.getValue() );
    	}
    	return result;
    }
}