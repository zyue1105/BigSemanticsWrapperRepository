//
// CiteseerxSearchResult.cs
// s.im.pl serialization
//
// Generated by MetaMetadataDotNetTranslator.
// Copyright 2012 Interface Ecology Lab. 
//


using Ecologylab.Collections;
using Ecologylab.Semantics.MetaMetadataNS;
using Ecologylab.Semantics.MetadataNS.Builtins;
using Ecologylab.Semantics.MetadataNS.Scalar;
using Simpl.Fundamental.Generic;
using Simpl.Serialization;
using Simpl.Serialization.Attributes;
using System;
using System.Collections;
using System.Collections.Generic;

namespace Ecologylab.Semantics.Generated.Library.BibManagingNS 
{
	[SimplInherit]
	public class CiteseerxSearchResult : Document
	{
		[SimplScalar]
		private MetadataString citationInfo;

		public CiteseerxSearchResult()
		{ }

		public CiteseerxSearchResult(MetaMetadataCompositeField mmd) : base(mmd) { }


		public MetadataString CitationInfo
		{
			get{return citationInfo;}
			set
			{
				if (this.citationInfo != value)
				{
					this.citationInfo = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}
	}
}
