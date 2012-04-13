//
// CastMember.cs
// s.im.pl serialization
//
// Generated by MetaMetadataDotNetTranslator.
// Copyright 2012 Interface Ecology Lab. 
//


using Simpl.Fundamental.Generic;
using Simpl.Serialization;
using Simpl.Serialization.Attributes;
using System;
using System.Collections;
using System.Collections.Generic;
using ecologylab.collections;
using ecologylab.semantics.generated.library.imdb;
using ecologylab.semantics.metadata;
using ecologylab.semantics.metadata.builtins;
using ecologylab.semantics.metametadata;

namespace ecologylab.semantics.generated.library.imdb 
{
	[SimplInherit]
	public class CastMember : Metadata
	{
		[SimplComposite]
		[MmName("actor")]
		private PersonDetails actor;

		[SimplComposite]
		[MmName("character")]
		private PersonDetails character;

		public CastMember()
		{ }

		public CastMember(MetaMetadataCompositeField mmd) : base(mmd) { }


		public PersonDetails Actor
		{
			get{return actor;}
			set
			{
				if (this.actor != value)
				{
					this.actor = value;
					this.RaisePropertyChanged( () => this.Actor );
				}
			}
		}

		public PersonDetails Character
		{
			get{return character;}
			set
			{
				if (this.character != value)
				{
					this.character = value;
					this.RaisePropertyChanged( () => this.Character );
				}
			}
		}
	}
}