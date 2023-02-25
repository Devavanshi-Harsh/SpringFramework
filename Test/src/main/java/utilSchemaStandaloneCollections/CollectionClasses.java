package utilSchemaStandaloneCollections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;

public class CollectionClasses {
	public LinkedList<Integer> _linkedlist;
	public ArrayList<Integer> _arrayList;
	public HashSet<Integer> _hashSet;
	public LinkedHashSet<Integer> _linkedSet;
	public HashMap<String, Integer> _hashMap;

	public CollectionClasses(LinkedList<Integer> _linkedlist, ArrayList<Integer> _arrayList, HashSet<Integer> _hashSet,
			LinkedHashSet<Integer> _linkedSet, HashMap<String, Integer> _hashMap) {
		super();
		this._linkedlist = _linkedlist;
		this._arrayList = _arrayList;
		this._hashSet = _hashSet;
		this._linkedSet = _linkedSet;
		this._hashMap = _hashMap;
	}

	@Override
	public String toString() {
		return "CollectionClasses [\n_linkedlist=" + _linkedlist + ",\n _arrayList=" + _arrayList + ",\n _hashSet="
				+ _hashSet + ",\n _linkedSet=" + _linkedSet + ",\n _hashMap=" + _hashMap + "]";
	}

}
