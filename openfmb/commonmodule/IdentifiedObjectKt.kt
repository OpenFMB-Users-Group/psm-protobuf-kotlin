// Generated by the protocol buffer compiler. DO NOT EDIT!
// source: commonmodule/commonmodule.proto

// Generated files should ignore deprecation warnings
@file:Suppress("DEPRECATION")
package openfmb.commonmodule;

@kotlin.jvm.JvmName("-initializeidentifiedObject")
public inline fun identifiedObject(block: openfmb.commonmodule.IdentifiedObjectKt.Dsl.() -> kotlin.Unit): openfmb.commonmodule.IdentifiedObject =
  openfmb.commonmodule.IdentifiedObjectKt.Dsl._create(openfmb.commonmodule.IdentifiedObject.newBuilder()).apply { block() }._build()
/**
 * ```
 * This is a root class to provide common identification for all classes needing identification and
 * naming attributes.
 * ```
 *
 * Protobuf type `commonmodule.IdentifiedObject`
 */
public object IdentifiedObjectKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: openfmb.commonmodule.IdentifiedObject.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: openfmb.commonmodule.IdentifiedObject.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): openfmb.commonmodule.IdentifiedObject = _builder.build()

    /**
     * ```
     * MISSING DOCUMENTATION!!!
     * ```
     *
     * `.google.protobuf.StringValue description = 1;`
     */
    public var description: com.google.protobuf.StringValue
      @JvmName("getDescription")
      get() = _builder.getDescription()
      @JvmName("setDescription")
      set(value) {
        _builder.setDescription(value)
      }
    /**
     * ```
     * MISSING DOCUMENTATION!!!
     * ```
     *
     * `.google.protobuf.StringValue description = 1;`
     */
    public fun clearDescription() {
      _builder.clearDescription()
    }
    /**
     * ```
     * MISSING DOCUMENTATION!!!
     * ```
     *
     * `.google.protobuf.StringValue description = 1;`
     * @return Whether the description field is set.
     */
    public fun hasDescription(): kotlin.Boolean {
      return _builder.hasDescription()
    }

    /**
     * ```
     * Master resource identifier issued by a model authority. The mRID must semantically be a UUID as
     * specified in RFC 4122. The mRID is globally unique.
     * ```
     *
     * `.google.protobuf.StringValue mRID = 2 [(.uml.option_uuid) = true];`
     */
    public var mRID: com.google.protobuf.StringValue
      @JvmName("getMRID")
      get() = _builder.getMRID()
      @JvmName("setMRID")
      set(value) {
        _builder.setMRID(value)
      }
    /**
     * ```
     * Master resource identifier issued by a model authority. The mRID must semantically be a UUID as
     * specified in RFC 4122. The mRID is globally unique.
     * ```
     *
     * `.google.protobuf.StringValue mRID = 2 [(.uml.option_uuid) = true];`
     */
    public fun clearMRID() {
      _builder.clearMRID()
    }
    /**
     * ```
     * Master resource identifier issued by a model authority. The mRID must semantically be a UUID as
     * specified in RFC 4122. The mRID is globally unique.
     * ```
     *
     * `.google.protobuf.StringValue mRID = 2 [(.uml.option_uuid) = true];`
     * @return Whether the mRID field is set.
     */
    public fun hasMRID(): kotlin.Boolean {
      return _builder.hasMRID()
    }

    /**
     * ```
     * The name is any free human readable and possibly non unique text naming the object.
     * ```
     *
     * `.google.protobuf.StringValue name = 3;`
     */
    public var name: com.google.protobuf.StringValue
      @JvmName("getName")
      get() = _builder.getName()
      @JvmName("setName")
      set(value) {
        _builder.setName(value)
      }
    /**
     * ```
     * The name is any free human readable and possibly non unique text naming the object.
     * ```
     *
     * `.google.protobuf.StringValue name = 3;`
     */
    public fun clearName() {
      _builder.clearName()
    }
    /**
     * ```
     * The name is any free human readable and possibly non unique text naming the object.
     * ```
     *
     * `.google.protobuf.StringValue name = 3;`
     * @return Whether the name field is set.
     */
    public fun hasName(): kotlin.Boolean {
      return _builder.hasName()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun openfmb.commonmodule.IdentifiedObject.copy(block: openfmb.commonmodule.IdentifiedObjectKt.Dsl.() -> kotlin.Unit): openfmb.commonmodule.IdentifiedObject =
  openfmb.commonmodule.IdentifiedObjectKt.Dsl._create(this.toBuilder()).apply { block() }._build()

public val openfmb.commonmodule.IdentifiedObjectOrBuilder.descriptionOrNull: com.google.protobuf.StringValue?
  get() = if (hasDescription()) getDescription() else null

public val openfmb.commonmodule.IdentifiedObjectOrBuilder.mRIDOrNull: com.google.protobuf.StringValue?
  get() = if (hasMRID()) getMRID() else null

public val openfmb.commonmodule.IdentifiedObjectOrBuilder.nameOrNull: com.google.protobuf.StringValue?
  get() = if (hasName()) getName() else null

