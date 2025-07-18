// Generated by the protocol buffer compiler. DO NOT EDIT!
// source: capbankmodule/capbankmodule.proto

// Generated files should ignore deprecation warnings
@file:Suppress("DEPRECATION")
package openfmb.capbankmodule;

@kotlin.jvm.JvmName("-initializecapBankDiscreteControlYPSH")
public inline fun capBankDiscreteControlYPSH(block: openfmb.capbankmodule.CapBankDiscreteControlYPSHKt.Dsl.() -> kotlin.Unit): openfmb.capbankmodule.CapBankDiscreteControlYPSH =
  openfmb.capbankmodule.CapBankDiscreteControlYPSHKt.Dsl._create(openfmb.capbankmodule.CapBankDiscreteControlYPSH.newBuilder()).apply { block() }._build()
/**
 * ```
 * OpenFMB specialization for cap bank discrete control:
 * ```
 *
 * Protobuf type `capbankmodule.CapBankDiscreteControlYPSH`
 */
public object CapBankDiscreteControlYPSHKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: openfmb.capbankmodule.CapBankDiscreteControlYPSH.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: openfmb.capbankmodule.CapBankDiscreteControlYPSH.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): openfmb.capbankmodule.CapBankDiscreteControlYPSH = _builder.build()

    /**
     * ```
     * UML inherited base object
     * ```
     *
     * `.commonmodule.LogicalNodeForControl logicalNodeForControl = 1 [(.uml.option_parent_message) = true];`
     */
    public var logicalNodeForControl: openfmb.commonmodule.LogicalNodeForControl
      @JvmName("getLogicalNodeForControl")
      get() = _builder.getLogicalNodeForControl()
      @JvmName("setLogicalNodeForControl")
      set(value) {
        _builder.setLogicalNodeForControl(value)
      }
    /**
     * ```
     * UML inherited base object
     * ```
     *
     * `.commonmodule.LogicalNodeForControl logicalNodeForControl = 1 [(.uml.option_parent_message) = true];`
     */
    public fun clearLogicalNodeForControl() {
      _builder.clearLogicalNodeForControl()
    }
    /**
     * ```
     * UML inherited base object
     * ```
     *
     * `.commonmodule.LogicalNodeForControl logicalNodeForControl = 1 [(.uml.option_parent_message) = true];`
     * @return Whether the logicalNodeForControl field is set.
     */
    public fun hasLogicalNodeForControl(): kotlin.Boolean {
      return _builder.hasLogicalNodeForControl()
    }

    /**
     * ```
     * MISSING DOCUMENTATION!!!
     * ```
     *
     * `.capbankmodule.CapBankControlYPSH control = 2;`
     */
    public var control: openfmb.capbankmodule.CapBankControlYPSH
      @JvmName("getControl")
      get() = _builder.getControl()
      @JvmName("setControl")
      set(value) {
        _builder.setControl(value)
      }
    /**
     * ```
     * MISSING DOCUMENTATION!!!
     * ```
     *
     * `.capbankmodule.CapBankControlYPSH control = 2;`
     */
    public fun clearControl() {
      _builder.clearControl()
    }
    /**
     * ```
     * MISSING DOCUMENTATION!!!
     * ```
     *
     * `.capbankmodule.CapBankControlYPSH control = 2;`
     * @return Whether the control field is set.
     */
    public fun hasControl(): kotlin.Boolean {
      return _builder.hasControl()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun openfmb.capbankmodule.CapBankDiscreteControlYPSH.copy(block: openfmb.capbankmodule.CapBankDiscreteControlYPSHKt.Dsl.() -> kotlin.Unit): openfmb.capbankmodule.CapBankDiscreteControlYPSH =
  openfmb.capbankmodule.CapBankDiscreteControlYPSHKt.Dsl._create(this.toBuilder()).apply { block() }._build()

public val openfmb.capbankmodule.CapBankDiscreteControlYPSHOrBuilder.logicalNodeForControlOrNull: openfmb.commonmodule.LogicalNodeForControl?
  get() = if (hasLogicalNodeForControl()) getLogicalNodeForControl() else null

public val openfmb.capbankmodule.CapBankDiscreteControlYPSHOrBuilder.controlOrNull: openfmb.capbankmodule.CapBankControlYPSH?
  get() = if (hasControl()) getControl() else null

