// Generated by the protocol buffer compiler. DO NOT EDIT!
// source: solarmodule/solarmodule.proto

// Generated files should ignore deprecation warnings
@file:Suppress("DEPRECATION")
package openfmb.solarmodule;

@kotlin.jvm.JvmName("-initializesolarDiscreteControlPV")
public inline fun solarDiscreteControlPV(block: openfmb.solarmodule.SolarDiscreteControlPVKt.Dsl.() -> kotlin.Unit): openfmb.solarmodule.SolarDiscreteControlPV =
  openfmb.solarmodule.SolarDiscreteControlPVKt.Dsl._create(openfmb.solarmodule.SolarDiscreteControlPV.newBuilder()).apply { block() }._build()
/**
 * ```
 * OpenFMB specialization for cap bank discrete control:
 * ```
 *
 * Protobuf type `solarmodule.SolarDiscreteControlPV`
 */
public object SolarDiscreteControlPVKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: openfmb.solarmodule.SolarDiscreteControlPV.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: openfmb.solarmodule.SolarDiscreteControlPV.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): openfmb.solarmodule.SolarDiscreteControlPV = _builder.build()

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
     * `.solarmodule.SolarPoint control = 2;`
     */
    public var control: openfmb.solarmodule.SolarPoint
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
     * `.solarmodule.SolarPoint control = 2;`
     */
    public fun clearControl() {
      _builder.clearControl()
    }
    /**
     * ```
     * MISSING DOCUMENTATION!!!
     * ```
     *
     * `.solarmodule.SolarPoint control = 2;`
     * @return Whether the control field is set.
     */
    public fun hasControl(): kotlin.Boolean {
      return _builder.hasControl()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun openfmb.solarmodule.SolarDiscreteControlPV.copy(block: openfmb.solarmodule.SolarDiscreteControlPVKt.Dsl.() -> kotlin.Unit): openfmb.solarmodule.SolarDiscreteControlPV =
  openfmb.solarmodule.SolarDiscreteControlPVKt.Dsl._create(this.toBuilder()).apply { block() }._build()

public val openfmb.solarmodule.SolarDiscreteControlPVOrBuilder.logicalNodeForControlOrNull: openfmb.commonmodule.LogicalNodeForControl?
  get() = if (hasLogicalNodeForControl()) getLogicalNodeForControl() else null

public val openfmb.solarmodule.SolarDiscreteControlPVOrBuilder.controlOrNull: openfmb.solarmodule.SolarPoint?
  get() = if (hasControl()) getControl() else null

