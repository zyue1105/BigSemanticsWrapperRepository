//
// UserSearchAdditionalMetadata.cs
// s.im.pl serialization
//
// Generated by MetaMetadataDotNetTranslator.
// Copyright 2013 Interface Ecology Lab. 
//


using Ecologylab.Collections;
using Ecologylab.Semantics.Generated.Library.DleseNS;
using Ecologylab.Semantics.MetaMetadataNS;
using Ecologylab.Semantics.MetadataNS;
using Ecologylab.Semantics.MetadataNS.Builtins;
using Simpl.Fundamental.Generic;
using Simpl.Serialization;
using Simpl.Serialization.Attributes;
using System;
using System.Collections;
using System.Collections.Generic;

namespace Ecologylab.Semantics.Generated.Library.DleseNS 
{
	[SimplInherit]
	public class UserSearchAdditionalMetadata : AdditionalMetadata
	{
		[SimplComposite]
		[SimplTag("adn")]
		[MmName("search_additional_metadata_adn")]
		private SearchAdditionalMetadataAdn searchAdditionalMetadataAdn;

		public UserSearchAdditionalMetadata()
		{ }

		public UserSearchAdditionalMetadata(MetaMetadataCompositeField mmd) : base(mmd) { }


		public SearchAdditionalMetadataAdn SearchAdditionalMetadataAdn
		{
			get{return searchAdditionalMetadataAdn;}
			set
			{
				if (this.searchAdditionalMetadataAdn != value)
				{
					this.searchAdditionalMetadataAdn = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}
	}
}
