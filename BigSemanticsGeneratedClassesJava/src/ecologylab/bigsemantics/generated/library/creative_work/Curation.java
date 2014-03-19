package ecologylab.bigsemantics.generated.library.creative_work;

/**
 * Automatically generated by MetaMetadataJavaTranslator
 *
 * DO NOT modify this code manually: All your changes may get lost!
 *
 * Copyright (2014) Interface Ecology Lab.
 */

import ecologylab.bigsemantics.generated.library.creative_work.CreativeWork;
import ecologylab.bigsemantics.metadata.builtins.MetadataBuiltinsTypesScope;
import ecologylab.bigsemantics.metadata.builtins.RichArtifact;
import ecologylab.bigsemantics.metadata.mm_name;
import ecologylab.bigsemantics.metadata.scalar.MetadataString;
import ecologylab.bigsemantics.metametadata.MetaMetadataCompositeField;
import ecologylab.bigsemantics.namesandnums.SemanticsNames;
import ecologylab.serialization.annotations.simpl_collection;
import ecologylab.serialization.annotations.simpl_inherit;
import ecologylab.serialization.annotations.simpl_other_tags;
import ecologylab.serialization.annotations.simpl_scalar;
import ecologylab.serialization.annotations.simpl_scope;
import java.lang.String;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@simpl_inherit
public class Curation extends CreativeWork
{
	@simpl_collection
	@simpl_scope("rich_artifacts_scope")
	@mm_name("metadata_collection")
	private List<RichArtifact> metadataCollection;

	@simpl_scalar
	@simpl_other_tags({"version"})
	private MetadataString curationAppVersion;

	@simpl_scalar
	private MetadataString curationApp;

	@simpl_scalar
	@simpl_other_tags({"metadata_version"})
	private MetadataString crossPlatformVersion;

	public Curation()
	{ super(); }

	public Curation(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public List<RichArtifact> getMetadataCollection()
	{
		return metadataCollection;
	}

  // lazy evaluation:
  public List<RichArtifact> metadataCollection()
  {
    if (metadataCollection == null)
      metadataCollection = new ArrayList<RichArtifact>();
    return metadataCollection;
  }

  // addTo:
  public void addToMetadataCollection(RichArtifact element)
  {
    metadataCollection().add(element);
  }

  // size:
  public int metadataCollectionSize()
  {
    return metadataCollection == null ? 0 : metadataCollection.size();
  }

	public void setMetadataCollection(List<RichArtifact> metadataCollection)
	{
		this.metadataCollection = metadataCollection;
	}

	public MetadataString	curationAppVersion()
	{
		MetadataString	result = this.curationAppVersion;
		if (result == null)
		{
			result = new MetadataString();
			this.curationAppVersion = result;
		}
		return result;
	}

	public String getCurationAppVersion()
	{
		return this.curationAppVersion == null ? null : curationAppVersion().getValue();
	}

	public MetadataString getCurationAppVersionMetadata()
	{
		return curationAppVersion;
	}

	public void setCurationAppVersion(String curationAppVersion)
	{
		if (curationAppVersion != null)
			this.curationAppVersion().setValue(curationAppVersion);
	}

	public void setCurationAppVersionMetadata(MetadataString curationAppVersion)
	{
		this.curationAppVersion = curationAppVersion;
	}

	public MetadataString	curationApp()
	{
		MetadataString	result = this.curationApp;
		if (result == null)
		{
			result = new MetadataString();
			this.curationApp = result;
		}
		return result;
	}

	public String getCurationApp()
	{
		return this.curationApp == null ? null : curationApp().getValue();
	}

	public MetadataString getCurationAppMetadata()
	{
		return curationApp;
	}

	public void setCurationApp(String curationApp)
	{
		if (curationApp != null)
			this.curationApp().setValue(curationApp);
	}

	public void setCurationAppMetadata(MetadataString curationApp)
	{
		this.curationApp = curationApp;
	}

	public MetadataString	crossPlatformVersion()
	{
		MetadataString	result = this.crossPlatformVersion;
		if (result == null)
		{
			result = new MetadataString();
			this.crossPlatformVersion = result;
		}
		return result;
	}

	public String getCrossPlatformVersion()
	{
		return this.crossPlatformVersion == null ? null : crossPlatformVersion().getValue();
	}

	public MetadataString getCrossPlatformVersionMetadata()
	{
		return crossPlatformVersion;
	}

	public void setCrossPlatformVersion(String crossPlatformVersion)
	{
		if (crossPlatformVersion != null)
			this.crossPlatformVersion().setValue(crossPlatformVersion);
	}

	public void setCrossPlatformVersionMetadata(MetadataString crossPlatformVersion)
	{
		this.crossPlatformVersion = crossPlatformVersion;
	}
}
