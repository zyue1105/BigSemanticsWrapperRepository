package ecologylab.semantics.generated.library.slashdot;

import ecologylab.semantics.metadata.scalar.MetadataString;
import ecologylab.semantics.metametadata.MetaMetadataCompositeField;
import ecologylab.serialization.Hint;
import ecologylab.semantics.generated.library.rss.Item;
import ecologylab.serialization.simpl_inherit;

/**
*  SlashdotItem.java
*  s.im.pl serialization
*
*  Generated by JavaTranslator on 08/27/11.
*  Copyright 2011 Interface Ecology Lab. 
*/

/** 
	 * One item in a feed.
 */ 
@simpl_inherit
public class SlashdotItem extends Item
{
	/** 
	 */ 
	@simpl_scalar	@xml_tag("slash:department")	@simpl_hints(Hint.XML_LEAF)	
	private ecologylab.semantics.metadata.scalar.MetadataString department;

	/** 
	 */ 
	@simpl_scalar	@xml_tag("slash:section")	@simpl_hints(Hint.XML_LEAF)	
	private ecologylab.semantics.metadata.scalar.MetadataString section;

	public SlashdotItem()
	{ }

	public SlashdotItem(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public MetadataString	department()
	{
		MetadataString	result = this.department;
		if (result == null)
		{
			result = new MetadataString();
			this.department = result;
		}
		return result;
	}

	public String getDepartment()
	{
		return this.department == null ? null : department().getValue();
	}

	public ecologylab.semantics.metadata.scalar.MetadataString getDepartmentMetadata()
	{
		return department;
	}

	public void setDepartment(String department)
	{
		if (department != null)
			this.department().setValue(department);
	}

	public void setDepartmentMetadata(ecologylab.semantics.metadata.scalar.MetadataString department)
	{
		this.department = department;
	}

	public MetadataString	section()
	{
		MetadataString	result = this.section;
		if (result == null)
		{
			result = new MetadataString();
			this.section = result;
		}
		return result;
	}

	public String getSection()
	{
		return this.section == null ? null : section().getValue();
	}

	public ecologylab.semantics.metadata.scalar.MetadataString getSectionMetadata()
	{
		return section;
	}

	public void setSection(String section)
	{
		if (section != null)
			this.section().setValue(section);
	}

	public void setSectionMetadata(ecologylab.semantics.metadata.scalar.MetadataString section)
	{
		this.section = section;
	}
}
