package ecologylab.semantics.generated.library.product_and_service;

/**
 * Automatically generated by MetaMetadataJavaTranslator
 *
 * DO NOT modify this code manually: All your changes may get lost!
 *
 * Copyright (2013) Interface Ecology Lab.
 */

import ecologylab.semantics.generated.library.product_and_service.Commodity;
import ecologylab.semantics.metadata.builtins.MetadataBuiltinsTypesScope;
import ecologylab.semantics.metadata.scalar.MetadataString;
import ecologylab.semantics.metametadata.MetaMetadataCompositeField;
import ecologylab.semantics.namesandnums.SemanticsNames;
import ecologylab.serialization.annotations.simpl_inherit;
import ecologylab.serialization.annotations.simpl_scalar;
import java.lang.String;
import java.util.List;
import java.util.Map;

@simpl_inherit
public class Product extends Commodity
{
	@simpl_scalar
	private MetadataString model;

	public Product()
	{ super(); }

	public Product(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public MetadataString	model()
	{
		MetadataString	result = this.model;
		if (result == null)
		{
			result = new MetadataString();
			this.model = result;
		}
		return result;
	}

	public String getModel()
	{
		return this.model == null ? null : model().getValue();
	}

	public MetadataString getModelMetadata()
	{
		return model;
	}

	public void setModel(String model)
	{
		if (model != null)
			this.model().setValue(model);
	}

	public void setModelMetadata(MetadataString model)
	{
		this.model = model;
	}
}