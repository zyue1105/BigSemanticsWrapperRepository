package ecologylab.semantics.generated.library.nsf;

/**
 * Automatically generated by MetaMetadataJavaTranslator
 *
 * DO NOT modify this code manually: All your changes may get lost!
 *
 * Copyright (2012) Interface Ecology Lab.
 */

import ecologylab.semantics.generated.library.grant.Grant;
import ecologylab.semantics.generated.library.nsf.NsfDivision;
import ecologylab.semantics.metadata.builtins.MetadataBuiltinsTypesScope;
import ecologylab.semantics.metadata.mm_name;
import ecologylab.semantics.metadata.scalar.MetadataDate;
import ecologylab.semantics.metadata.scalar.MetadataString;
import ecologylab.semantics.metametadata.MetaMetadataCompositeField;
import ecologylab.semantics.namesandnums.SemanticsNames;
import ecologylab.serialization.annotations.simpl_collection;
import ecologylab.serialization.annotations.simpl_composite;
import ecologylab.serialization.annotations.simpl_inherit;
import ecologylab.serialization.annotations.simpl_scalar;
import java.lang.String;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

/** 
 *NSF award details.
 */ 
@simpl_inherit
public class NsfAward extends Grant
{
	@simpl_composite
	@mm_name("division")
	private NsfDivision division;

	@simpl_scalar
	private MetadataString amountString;

	@simpl_scalar
	private MetadataString awardInstrument;

	@simpl_scalar
	private MetadataString fieldApplications;

	@simpl_scalar
	private MetadataDate initialAmendmentDate;

	@simpl_scalar
	private MetadataDate latestAmendmentDate;

	@simpl_scalar
	private MetadataString programReferenceCodes;

	@simpl_collection("program_element_code")
	@mm_name("program_element_codes")
	private List<MetadataString> programElementCodes;

	public NsfAward()
	{ super(); }

	public NsfAward(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public NsfDivision getDivision()
	{
		return division;
	}

	public void setDivision(NsfDivision division)
	{
		this.division = division;
	}

	public MetadataString	amountString()
	{
		MetadataString	result = this.amountString;
		if (result == null)
		{
			result = new MetadataString();
			this.amountString = result;
		}
		return result;
	}

	public String getAmountString()
	{
		return this.amountString == null ? null : amountString().getValue();
	}

	public MetadataString getAmountStringMetadata()
	{
		return amountString;
	}

	public void setAmountString(String amountString)
	{
		if (amountString != null)
			this.amountString().setValue(amountString);
	}

	public void setAmountStringMetadata(MetadataString amountString)
	{
		this.amountString = amountString;
	}

	public MetadataString	awardInstrument()
	{
		MetadataString	result = this.awardInstrument;
		if (result == null)
		{
			result = new MetadataString();
			this.awardInstrument = result;
		}
		return result;
	}

	public String getAwardInstrument()
	{
		return this.awardInstrument == null ? null : awardInstrument().getValue();
	}

	public MetadataString getAwardInstrumentMetadata()
	{
		return awardInstrument;
	}

	public void setAwardInstrument(String awardInstrument)
	{
		if (awardInstrument != null)
			this.awardInstrument().setValue(awardInstrument);
	}

	public void setAwardInstrumentMetadata(MetadataString awardInstrument)
	{
		this.awardInstrument = awardInstrument;
	}

	public MetadataString	fieldApplications()
	{
		MetadataString	result = this.fieldApplications;
		if (result == null)
		{
			result = new MetadataString();
			this.fieldApplications = result;
		}
		return result;
	}

	public String getFieldApplications()
	{
		return this.fieldApplications == null ? null : fieldApplications().getValue();
	}

	public MetadataString getFieldApplicationsMetadata()
	{
		return fieldApplications;
	}

	public void setFieldApplications(String fieldApplications)
	{
		if (fieldApplications != null)
			this.fieldApplications().setValue(fieldApplications);
	}

	public void setFieldApplicationsMetadata(MetadataString fieldApplications)
	{
		this.fieldApplications = fieldApplications;
	}

	public MetadataDate	initialAmendmentDate()
	{
		MetadataDate	result = this.initialAmendmentDate;
		if (result == null)
		{
			result = new MetadataDate();
			this.initialAmendmentDate = result;
		}
		return result;
	}

	public Date getInitialAmendmentDate()
	{
		return this.initialAmendmentDate == null ? null : initialAmendmentDate().getValue();
	}

	public MetadataDate getInitialAmendmentDateMetadata()
	{
		return initialAmendmentDate;
	}

	public void setInitialAmendmentDate(Date initialAmendmentDate)
	{
		if (initialAmendmentDate != null)
			this.initialAmendmentDate().setValue(initialAmendmentDate);
	}

	public void setInitialAmendmentDateMetadata(MetadataDate initialAmendmentDate)
	{
		this.initialAmendmentDate = initialAmendmentDate;
	}

	public MetadataDate	latestAmendmentDate()
	{
		MetadataDate	result = this.latestAmendmentDate;
		if (result == null)
		{
			result = new MetadataDate();
			this.latestAmendmentDate = result;
		}
		return result;
	}

	public Date getLatestAmendmentDate()
	{
		return this.latestAmendmentDate == null ? null : latestAmendmentDate().getValue();
	}

	public MetadataDate getLatestAmendmentDateMetadata()
	{
		return latestAmendmentDate;
	}

	public void setLatestAmendmentDate(Date latestAmendmentDate)
	{
		if (latestAmendmentDate != null)
			this.latestAmendmentDate().setValue(latestAmendmentDate);
	}

	public void setLatestAmendmentDateMetadata(MetadataDate latestAmendmentDate)
	{
		this.latestAmendmentDate = latestAmendmentDate;
	}

	public MetadataString	programReferenceCodes()
	{
		MetadataString	result = this.programReferenceCodes;
		if (result == null)
		{
			result = new MetadataString();
			this.programReferenceCodes = result;
		}
		return result;
	}

	public String getProgramReferenceCodes()
	{
		return this.programReferenceCodes == null ? null : programReferenceCodes().getValue();
	}

	public MetadataString getProgramReferenceCodesMetadata()
	{
		return programReferenceCodes;
	}

	public void setProgramReferenceCodes(String programReferenceCodes)
	{
		if (programReferenceCodes != null)
			this.programReferenceCodes().setValue(programReferenceCodes);
	}

	public void setProgramReferenceCodesMetadata(MetadataString programReferenceCodes)
	{
		this.programReferenceCodes = programReferenceCodes;
	}

	public List<MetadataString> getProgramElementCodes()
	{
		return programElementCodes;
	}

  // lazy evaluation:
  public List<MetadataString> programElementCodes()
  {
    if (programElementCodes == null)
      programElementCodes = new ArrayList<MetadataString>();
    return programElementCodes;
  }

  // addTo:
  public void addToProgramElementCodes(MetadataString element)
  {
    programElementCodes().add(element);
  }

  // size:
  public int programElementCodesSize()
  {
    return programElementCodes == null ? 0 : programElementCodes.size();
  }

	public void setProgramElementCodes(List<MetadataString> programElementCodes)
	{
		this.programElementCodes = programElementCodes;
	}
}
