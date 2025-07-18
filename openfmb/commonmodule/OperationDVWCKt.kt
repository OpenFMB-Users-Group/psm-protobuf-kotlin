// Generated by the protocol buffer compiler. DO NOT EDIT!
// source: commonmodule/commonmodule.proto

// Generated files should ignore deprecation warnings
@file:Suppress("DEPRECATION")
package openfmb.commonmodule;

@kotlin.jvm.JvmName("-initializeoperationDVWC")
public inline fun operationDVWC(block: openfmb.commonmodule.OperationDVWCKt.Dsl.() -> kotlin.Unit): openfmb.commonmodule.OperationDVWC =
  openfmb.commonmodule.OperationDVWCKt.Dsl._create(openfmb.commonmodule.OperationDVWC.newBuilder()).apply { block() }._build()
/**
 * ```
 * MISSING DOCUMENTATION!!!
 * ```
 *
 * Protobuf type `commonmodule.OperationDVWC`
 */
public object OperationDVWCKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: openfmb.commonmodule.OperationDVWC.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: openfmb.commonmodule.OperationDVWC.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): openfmb.commonmodule.OperationDVWC = _builder.build()

    /**
     * ```
     * Voltage-Active Power Mode Enable
     * ```
     *
     * `bool modEna = 1 [(.uml.option_required_field) = true, (.uml.option_multiplicity_min) = 1];`
     */
    public var modEna: kotlin.Boolean
      @JvmName("getModEna")
      get() = _builder.getModEna()
      @JvmName("setModEna")
      set(value) {
        _builder.setModEna(value)
      }
    /**
     * ```
     * Voltage-Active Power Mode Enable
     * ```
     *
     * `bool modEna = 1 [(.uml.option_required_field) = true, (.uml.option_multiplicity_min) = 1];`
     */
    public fun clearModEna() {
      _builder.clearModEna()
    }

    /**
     * ```
     * Open Loop Response Time
     * ```
     *
     * `.commonmodule.ClearingTime OplTmmsMax = 2 [(.uml.option_required_field) = true, (.uml.option_multiplicity_min) = 1];`
     */
    public var oplTmmsMax: openfmb.commonmodule.ClearingTime
      @JvmName("getOplTmmsMax")
      get() = _builder.getOplTmmsMax()
      @JvmName("setOplTmmsMax")
      set(value) {
        _builder.setOplTmmsMax(value)
      }
    /**
     * ```
     * Open Loop Response Time
     * ```
     *
     * `.commonmodule.ClearingTime OplTmmsMax = 2 [(.uml.option_required_field) = true, (.uml.option_multiplicity_min) = 1];`
     */
    public fun clearOplTmmsMax() {
      _builder.clearOplTmmsMax()
    }
    /**
     * ```
     * Open Loop Response Time
     * ```
     *
     * `.commonmodule.ClearingTime OplTmmsMax = 2 [(.uml.option_required_field) = true, (.uml.option_multiplicity_min) = 1];`
     * @return Whether the oplTmmsMax field is set.
     */
    public fun hasOplTmmsMax(): kotlin.Boolean {
      return _builder.hasOplTmmsMax()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun openfmb.commonmodule.OperationDVWC.copy(block: openfmb.commonmodule.OperationDVWCKt.Dsl.() -> kotlin.Unit): openfmb.commonmodule.OperationDVWC =
  openfmb.commonmodule.OperationDVWCKt.Dsl._create(this.toBuilder()).apply { block() }._build()

public val openfmb.commonmodule.OperationDVWCOrBuilder.oplTmmsMaxOrNull: openfmb.commonmodule.ClearingTime?
  get() = if (hasOplTmmsMax()) getOplTmmsMax() else null

