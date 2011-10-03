package ecologylab.semantics.generated.library.dlese;

import ecologylab.serialization.annotations.simpl_composite;
import ecologylab.semantics.metametadata.MetaMetadataCompositeField;
import ecologylab.serialization.annotations.simpl_inherit;
import ecologylab.semantics.generated.library.dlese.SearchSection;
import ecologylab.semantics.metadata.builtins.CompoundDocument;
import ecologylab.serialization.annotations.simpl_tag;

/**
*  DleseUserSearch.java
*  s.im.pl serialization
*
*  Generated by JavaTranslator on 10/03/11.
*  Copyright 2011 Interface Ecology Lab. 
*/

/** 
 */ 
@simpl_inherit
@simpl_tag("DDSWebService")
public class DleseUserSearch extends CompoundDocument
{
	/** 
	 */ 
	@simpl_composite	@simpl_tag("Search")	@mm_name("search_section")
	private SearchSection searchSection;

	public DleseUserSearch()
	{ }

	public DleseUserSearch(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public SearchSection getSearchSection()
	{
		return searchSection;
	}

	public void setSearchSection(SearchSection searchSection)
	{
		this.searchSection = searchSection;
	}
}
