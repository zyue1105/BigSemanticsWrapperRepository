//
// Icsmd.cs
// s.im.pl serialization
//
// Generated by MetaMetadataDotNetTranslator.
// Copyright 2013 Interface Ecology Lab. 
//


using Ecologylab.Collections;
using Ecologylab.Semantics.Generated.Library.DisasterNS;
using Ecologylab.Semantics.MetaMetadataNS;
using Ecologylab.Semantics.MetadataNS.Builtins;
using Ecologylab.Semantics.MetadataNS.Scalar;
using Simpl.Fundamental.Generic;
using Simpl.Serialization;
using Simpl.Serialization.Attributes;
using System;
using System.Collections;
using System.Collections.Generic;

namespace Ecologylab.Semantics.Generated.Library.DisasterNS 
{
	/// <summary>
	/// Generalized International Charter on Space and Major Disasters Object
	/// </summary>
	[SimplInherit]
	public class Icsmd : Disaster
	{
		[SimplScalar]
		private MetadataString eventType;

		[SimplScalar]
		private MetadataString eventLocation;

		[SimplScalar]
		private MetadataString dateOfCharterActivation;

		[SimplScalar]
		private MetadataString charterRequestor;

		[SimplScalar]
		private MetadataString projectManager;

		public Icsmd()
		{ }

		public Icsmd(MetaMetadataCompositeField mmd) : base(mmd) { }


		public MetadataString EventType
		{
			get{return eventType;}
			set
			{
				if (this.eventType != value)
				{
					this.eventType = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public MetadataString EventLocation
		{
			get{return eventLocation;}
			set
			{
				if (this.eventLocation != value)
				{
					this.eventLocation = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public MetadataString DateOfCharterActivation
		{
			get{return dateOfCharterActivation;}
			set
			{
				if (this.dateOfCharterActivation != value)
				{
					this.dateOfCharterActivation = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public MetadataString CharterRequestor
		{
			get{return charterRequestor;}
			set
			{
				if (this.charterRequestor != value)
				{
					this.charterRequestor = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public MetadataString ProjectManager
		{
			get{return projectManager;}
			set
			{
				if (this.projectManager != value)
				{
					this.projectManager = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}
	}
}
