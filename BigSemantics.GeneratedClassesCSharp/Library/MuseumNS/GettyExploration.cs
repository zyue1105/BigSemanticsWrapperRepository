//
// GettyExploration.cs
// s.im.pl serialization
//
// Generated by MetaMetadataDotNetTranslator.
// Copyright 2014 Interface Ecology Lab. 
//


using Ecologylab.Collections;
using Ecologylab.Semantics.Generated.Library.MuseumNS;
using Ecologylab.Semantics.MetaMetadataNS;
using Ecologylab.Semantics.MetadataNS;
using Ecologylab.Semantics.MetadataNS.Builtins;
using Simpl.Fundamental.Generic;
using Simpl.Serialization;
using Simpl.Serialization.Attributes;
using System;
using System.Collections;
using System.Collections.Generic;

namespace Ecologylab.Semantics.Generated.Library.MuseumNS 
{
	[SimplInherit]
	public class GettyExploration : CompoundDocument
	{
		[SimplCollection("getty_collection")]
		[MmName("collections")]
		private List<GettyCollection> collections;

		public GettyExploration()
		{ }

		public GettyExploration(MetaMetadataCompositeField mmd) : base(mmd) { }


		public List<GettyCollection> Collections
		{
			get{return collections;}
			set
			{
				if (this.collections != value)
				{
					this.collections = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}
	}
}
