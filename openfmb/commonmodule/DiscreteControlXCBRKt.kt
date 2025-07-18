// Generated by the protocol buffer compiler. DO NOT EDIT!
// source: commonmodule/commonmodule.proto

// Generated files should ignore deprecation warnings
@file:Suppress("DEPRECATION")
package openfmb.commonmodule;

@kotlin.jvm.JvmName("-initializediscreteControlXCBR")
public inline fun discreteControlXCBR(block: openfmb.commonmodule.DiscreteControlXCBRKt.Dsl.() -> kotlin.Unit): openfmb.commonmodule.DiscreteControlXCBR =
  openfmb.commonmodule.DiscreteControlXCBRKt.Dsl._create(openfmb.commonmodule.DiscreteControlXCBR.newBuilder()).apply { block() }._build()
/**
 * ```
 * Reclose enabled
 * ```
 *
 * Protobuf type `commonmodule.DiscreteControlXCBR`
 */
public object DiscreteControlXCBRKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: openfmb.commonmodule.DiscreteControlXCBR.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: openfmb.commonmodule.DiscreteControlXCBR.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): openfmb.commonmodule.DiscreteControlXCBR = _builder.build()

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
     * `.commonmodule.PhaseDPC Pos = 2;`
     */
    public var pos: openfmb.commonmodule.PhaseDPC
      @JvmName("getPos")
      get() = _builder.getPos()
      @JvmName("setPos")
      set(value) {
        _builder.setPos(value)
      }
    /**
     * ```
     * MISSING DOCUMENTATION!!!
     * ```
     *
     * `.commonmodule.PhaseDPC Pos = 2;`
     */
    public fun clearPos() {
      _builder.clearPos()
    }
    /**
     * ```
     * MISSING DOCUMENTATION!!!
     * ```
     *
     * `.commonmodule.PhaseDPC Pos = 2;`
     * @return Whether the pos field is set.
     */
    public fun hasPos(): kotlin.Boolean {
      return _builder.hasPos()
    }

    /**
     * ```
     * Protection mode such as a group setting or pre-defined curve profile. It is usually pre-defined
     * by a circuit segment service.
     * ```
     *
     * `.commonmodule.ControlINC ProtectionMode = 3;`
     */
    public var protectionMode: openfmb.commonmodule.ControlINC
      @JvmName("getProtectionMode")
      get() = _builder.getProtectionMode()
      @JvmName("setProtectionMode")
      set(value) {
        _builder.setProtectionMode(value)
      }
    /**
     * ```
     * Protection mode such as a group setting or pre-defined curve profile. It is usually pre-defined
     * by a circuit segment service.
     * ```
     *
     * `.commonmodule.ControlINC ProtectionMode = 3;`
     */
    public fun clearProtectionMode() {
      _builder.clearProtectionMode()
    }
    /**
     * ```
     * Protection mode such as a group setting or pre-defined curve profile. It is usually pre-defined
     * by a circuit segment service.
     * ```
     *
     * `.commonmodule.ControlINC ProtectionMode = 3;`
     * @return Whether the protectionMode field is set.
     */
    public fun hasProtectionMode(): kotlin.Boolean {
      return _builder.hasProtectionMode()
    }

    /**
     * ```
     * MISSING DOCUMENTATION!!!
     * ```
     *
     * `.commonmodule.ControlSPC RecloseEnabled = 4;`
     */
    public var recloseEnabled: openfmb.commonmodule.ControlSPC
      @JvmName("getRecloseEnabled")
      get() = _builder.getRecloseEnabled()
      @JvmName("setRecloseEnabled")
      set(value) {
        _builder.setRecloseEnabled(value)
      }
    /**
     * ```
     * MISSING DOCUMENTATION!!!
     * ```
     *
     * `.commonmodule.ControlSPC RecloseEnabled = 4;`
     */
    public fun clearRecloseEnabled() {
      _builder.clearRecloseEnabled()
    }
    /**
     * ```
     * MISSING DOCUMENTATION!!!
     * ```
     *
     * `.commonmodule.ControlSPC RecloseEnabled = 4;`
     * @return Whether the recloseEnabled field is set.
     */
    public fun hasRecloseEnabled(): kotlin.Boolean {
      return _builder.hasRecloseEnabled()
    }

    /**
     * ```
     * MISSING DOCUMENTATION!!!
     * ```
     *
     * `.commonmodule.ControlSPC ResetProtectionPickup = 5;`
     */
    public var resetProtectionPickup: openfmb.commonmodule.ControlSPC
      @JvmName("getResetProtectionPickup")
      get() = _builder.getResetProtectionPickup()
      @JvmName("setResetProtectionPickup")
      set(value) {
        _builder.setResetProtectionPickup(value)
      }
    /**
     * ```
     * MISSING DOCUMENTATION!!!
     * ```
     *
     * `.commonmodule.ControlSPC ResetProtectionPickup = 5;`
     */
    public fun clearResetProtectionPickup() {
      _builder.clearResetProtectionPickup()
    }
    /**
     * ```
     * MISSING DOCUMENTATION!!!
     * ```
     *
     * `.commonmodule.ControlSPC ResetProtectionPickup = 5;`
     * @return Whether the resetProtectionPickup field is set.
     */
    public fun hasResetProtectionPickup(): kotlin.Boolean {
      return _builder.hasResetProtectionPickup()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun openfmb.commonmodule.DiscreteControlXCBR.copy(block: openfmb.commonmodule.DiscreteControlXCBRKt.Dsl.() -> kotlin.Unit): openfmb.commonmodule.DiscreteControlXCBR =
  openfmb.commonmodule.DiscreteControlXCBRKt.Dsl._create(this.toBuilder()).apply { block() }._build()

public val openfmb.commonmodule.DiscreteControlXCBROrBuilder.logicalNodeForControlOrNull: openfmb.commonmodule.LogicalNodeForControl?
  get() = if (hasLogicalNodeForControl()) getLogicalNodeForControl() else null

public val openfmb.commonmodule.DiscreteControlXCBROrBuilder.posOrNull: openfmb.commonmodule.PhaseDPC?
  get() = if (hasPos()) getPos() else null

public val openfmb.commonmodule.DiscreteControlXCBROrBuilder.protectionModeOrNull: openfmb.commonmodule.ControlINC?
  get() = if (hasProtectionMode()) getProtectionMode() else null

public val openfmb.commonmodule.DiscreteControlXCBROrBuilder.recloseEnabledOrNull: openfmb.commonmodule.ControlSPC?
  get() = if (hasRecloseEnabled()) getRecloseEnabled() else null

public val openfmb.commonmodule.DiscreteControlXCBROrBuilder.resetProtectionPickupOrNull: openfmb.commonmodule.ControlSPC?
  get() = if (hasResetProtectionPickup()) getResetProtectionPickup() else null

