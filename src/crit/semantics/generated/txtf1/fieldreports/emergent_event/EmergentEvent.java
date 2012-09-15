package crit.semantics.generated.txtf1.fieldreports.emergent_event;

/**
 * Automatically generated by MetaMetadataJavaTranslator
 *
 * DO NOT modify this code manually: All your changes may get lost!
 *
 * Copyright (2012) Interface Ecology Lab.
 */

import ecologylab.semantics.generated.library.gis.GisLocation;
import ecologylab.semantics.metadata.Metadata;
import ecologylab.semantics.metadata.builtins.Image;
import ecologylab.semantics.metadata.builtins.MetadataBuiltinsTypesScope;
import ecologylab.semantics.metadata.mm_name;
import ecologylab.semantics.metadata.scalar.MetadataDate;
import ecologylab.semantics.metametadata.MetaMetadataCompositeField;
import ecologylab.semantics.namesandnums.SemanticsNames;
import ecologylab.serialization.annotations.simpl_composite;
import ecologylab.serialization.annotations.simpl_inherit;
import ecologylab.serialization.annotations.simpl_scalar;
import java.util.Date;
import java.util.List;
import java.util.Map;

/** 
 *an emergent event
 */ 
@simpl_inherit
public class EmergentEvent extends Metadata
{
	@simpl_composite
	@mm_name("photo")
	private Image photo;

	/** 
	 *Timestamp of the beginning of the incident
	 */ 
	@simpl_scalar
	private MetadataDate initialTime;

	@simpl_composite
	@mm_name("event_location")
	private GisLocation eventLocation;

	public EmergentEvent()
	{ super(); }

	public EmergentEvent(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public Image getPhoto()
	{
		return photo;
	}

	public void setPhoto(Image photo)
	{
		this.photo = photo;
	}

	public MetadataDate	initialTime()
	{
		MetadataDate	result = this.initialTime;
		if (result == null)
		{
			result = new MetadataDate();
			this.initialTime = result;
		}
		return result;
	}

	public Date getInitialTime()
	{
		return this.initialTime == null ? null : initialTime().getValue();
	}

	public MetadataDate getInitialTimeMetadata()
	{
		return initialTime;
	}

	public void setInitialTime(Date initialTime)
	{
		if (initialTime != null)
			this.initialTime().setValue(initialTime);
	}

	public void setInitialTimeMetadata(MetadataDate initialTime)
	{
		this.initialTime = initialTime;
	}

	public GisLocation getEventLocation()
	{
		return eventLocation;
	}

	public void setEventLocation(GisLocation eventLocation)
	{
		this.eventLocation = eventLocation;
	}
}
