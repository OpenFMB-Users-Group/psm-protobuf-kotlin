// Generated by the protocol buffer compiler. DO NOT EDIT!
// source: commonmodule/commonmodule.proto

// Generated files should ignore deprecation warnings
@file:Suppress("DEPRECATION")
package openfmb.commonmodule;

@kotlin.jvm.JvmName("-initializenamedObject")
public inline fun namedObject(block: openfmb.commonmodule.NamedObjectKt.Dsl.() -> kotlin.Unit): openfmb.commonmodule.NamedObject =
  openfmb.commonmodule.NamedObjectKt.Dsl._create(openfmb.commonmodule.NamedObject.newBuilder()).apply { block() }._build()
/**
 * ```
 * This is a root class similar to IdentifiedObject but without the mRID. The reason to separate
 * the two classes is because the mRID may need to be defined as a separate key field for technology
 * such as the DDS implementation.
 * ```
 *
 * Protobuf type `commonmodule.NamedObject`
 */
public object NamedObjectKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: openfmb.commonmodule.NamedObject.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: openfmb.commonmodule.NamedObject.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): openfmb.commonmodule.NamedObject = _builder.build()

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
     * The name is any free human readable and possibly non unique text naming the object.
     * ```
     *
     * `.google.protobuf.StringValue name = 2;`
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
     * `.google.protobuf.StringValue name = 2;`
     */
    public fun clearName() {
      _builder.clearName()
    }
    /**
     * ```
     * The name is any free human readable and possibly non unique text naming the object.
     * ```
     *
     * `.google.protobuf.StringValue name = 2;`
     * @return Whether the name field is set.
     */
    public fun hasName(): kotlin.Boolean {
      return _builder.hasName()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun openfmb.commonmodule.NamedObject.copy(block: openfmb.commonmodule.NamedObjectKt.Dsl.() -> kotlin.Unit): openfmb.commonmodule.NamedObject =
  openfmb.commonmodule.NamedObjectKt.Dsl._create(this.toBuilder()).apply { block() }._build()

public val openfmb.commonmodule.NamedObjectOrBuilder.descriptionOrNull: com.google.protobuf.StringValue?
  get() = if (hasDescription()) getDescription() else null

public val openfmb.commonmodule.NamedObjectOrBuilder.nameOrNull: com.google.protobuf.StringValue?
  get() = if (hasName()) getName() else null

