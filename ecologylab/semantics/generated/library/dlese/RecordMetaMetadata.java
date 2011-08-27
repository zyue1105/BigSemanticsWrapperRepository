package ecologylab.semantics.generated.library.dlese;

import java.util.ArrayList;
import ecologylab.semantics.metadata.scalar.MetadataString;
import ecologylab.semantics.metametadata.MetaMetadataCompositeField;
import java.util.List;
import ecologylab.semantics.metadata.Metadata;
import ecologylab.serialization.simpl_inherit;
import ecologylab.semantics.generated.library.dlese.DateInfo;

/**
*  RecordMetaMetadata.java
*  s.im.pl serialization
*
*  Generated by JavaTranslator on 08/27/11.
*  Copyright 2011 Interface Ecology Lab. 
*/

/** 
 */ 
@simpl_inherit
public class RecordMetaMetadata extends Metadata
{
	/** 
	 */ 
	@simpl_composite	@xml_tag("dateInfo")	@mm_name("date_info")
	private DateInfo dateInfo;

	/** 
	 */ 
	@simpl_collection("catalog")	@xml_tag("catalogEntries")	@mm_name("catalogs")
	private List<ecologylab.semantics.metadata.scalar.MetadataString> catalogs;

	public RecordMetaMetadata()
	{ }

	public RecordMetaMetadata(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public DateInfo getDateInfo()
	{
		return dateInfo;
	}

	public void setDateInfo(DateInfo dateInfo)
	{
		this.dateInfo = dateInfo;
	}

	public List<ecologylab.semantics.metadata.scalar.MetadataString> getCatalogs()
	{
		return catalogs;
	}

	public void setCatalogs(List<ecologylab.semantics.metadata.scalar.MetadataString> catalogs)
	{
		this.catalogs = catalogs;
	}
}
