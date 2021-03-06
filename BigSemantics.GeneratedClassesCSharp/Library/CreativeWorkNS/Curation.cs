//
// Curation.cs
// s.im.pl serialization
//
// Generated by MetaMetadataDotNetTranslator.
// Copyright 2014 Interface Ecology Lab. 
//


using Ecologylab.Collections;
using Ecologylab.Semantics.Generated.Library.CreativeWorkNS;
using Ecologylab.Semantics.MetaMetadataNS;
using Ecologylab.Semantics.MetadataNS;
using Ecologylab.Semantics.MetadataNS.Builtins;
using Ecologylab.Semantics.MetadataNS.Scalar;
using Simpl.Fundamental.Generic;
using Simpl.Serialization;
using Simpl.Serialization.Attributes;
using System;
using System.Collections;
using System.Collections.Generic;

namespace Ecologylab.Semantics.Generated.Library.CreativeWorkNS 
{
	[SimplInherit]
	public class Curation : CreativeWork
	{
		[SimplCollection]
		[SimplScope("rich_artifacts_scope")]
		[MmName("metadata_collection")]
		private List<IRichArtifact<Metadata>> metadataCollection;

		[SimplScalar]
		[SimplTag("version")]
		private MetadataString curationAppVersion;

		[SimplScalar]
		private MetadataString curationApp;

		[SimplScalar]
		[SimplTag("metadata_version")]
		private MetadataString crossPlatformVersion;

		public Curation()
		{ }

		public Curation(MetaMetadataCompositeField mmd) : base(mmd) { }


		public List<IRichArtifact<Metadata>> MetadataCollection
		{
			get{return metadataCollection;}
			set
			{
				if (this.metadataCollection != value)
				{
					this.metadataCollection = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public MetadataString CurationAppVersion
		{
			get{return curationAppVersion;}
			set
			{
				if (this.curationAppVersion != value)
				{
					this.curationAppVersion = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public MetadataString CurationApp
		{
			get{return curationApp;}
			set
			{
				if (this.curationApp != value)
				{
					this.curationApp = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public MetadataString CrossPlatformVersion
		{
			get{return crossPlatformVersion;}
			set
			{
				if (this.crossPlatformVersion != value)
				{
					this.crossPlatformVersion = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}
	}
}
