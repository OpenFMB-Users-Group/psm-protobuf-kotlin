// Generated by the protocol buffer compiler. DO NOT EDIT!
// source: commonmodule/commonmodule.proto

// Generated files should ignore deprecation warnings
@file:Suppress("DEPRECATION")
package openfmb.commonmodule;

@kotlin.jvm.JvmName("-initializestatusAndEventXCBR")
public inline fun statusAndEventXCBR(block: openfmb.commonmodule.StatusAndEventXCBRKt.Dsl.() -> kotlin.Unit): openfmb.commonmodule.StatusAndEventXCBR =
  openfmb.commonmodule.StatusAndEventXCBRKt.Dsl._create(openfmb.commonmodule.StatusAndEventXCBR.newBuilder()).apply { block() }._build()
/**
 * ```
 * OpenFMB specialization for breaker, recloser and switch status and event profiles:  LN: Circuit
 * breaker   Name: XCBR
 * ```
 *
 * Protobuf type `commonmodule.StatusAndEventXCBR`
 */
public object StatusAndEventXCBRKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: openfmb.commonmodule.StatusAndEventXCBR.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: openfmb.commonmodule.StatusAndEventXCBR.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): openfmb.commonmodule.StatusAndEventXCBR = _builder.build()

    /**
     * ```
     * UML inherited base object
     * ```
     *
     * `.commonmodule.LogicalNodeForEventAndStatus logicalNodeForEventAndStatus = 1 [(.uml.option_parent_message) = true];`
     */
    public var logicalNodeForEventAndStatus: openfmb.commonmodule.LogicalNodeForEventAndStatus
      @JvmName("getLogicalNodeForEventAndStatus")
      get() = _builder.getLogicalNodeForEventAndStatus()
      @JvmName("setLogicalNodeForEventAndStatus")
      set(value) {
        _builder.setLogicalNodeForEventAndStatus(value)
      }
    /**
     * ```
     * UML inherited base object
     * ```
     *
     * `.commonmodule.LogicalNodeForEventAndStatus logicalNodeForEventAndStatus = 1 [(.uml.option_parent_message) = true];`
     */
    public fun clearLogicalNodeForEventAndStatus() {
      _builder.clearLogicalNodeForEventAndStatus()
    }
    /**
     * ```
     * UML inherited base object
     * ```
     *
     * `.commonmodule.LogicalNodeForEventAndStatus logicalNodeForEventAndStatus = 1 [(.uml.option_parent_message) = true];`
     * @return Whether the logicalNodeForEventAndStatus field is set.
     */
    public fun hasLogicalNodeForEventAndStatus(): kotlin.Boolean {
      return _builder.hasLogicalNodeForEventAndStatus()
    }

    /**
     * ```
     * MISSING DOCUMENTATION!!!
     * ```
     *
     * `.commonmodule.ENS_DynamicTestKind DynamicTest = 2;`
     */
    public var dynamicTest: openfmb.commonmodule.ENS_DynamicTestKind
      @JvmName("getDynamicTest")
      get() = _builder.getDynamicTest()
      @JvmName("setDynamicTest")
      set(value) {
        _builder.setDynamicTest(value)
      }
    /**
     * ```
     * MISSING DOCUMENTATION!!!
     * ```
     *
     * `.commonmodule.ENS_DynamicTestKind DynamicTest = 2;`
     */
    public fun clearDynamicTest() {
      _builder.clearDynamicTest()
    }
    /**
     * ```
     * MISSING DOCUMENTATION!!!
     * ```
     *
     * `.commonmodule.ENS_DynamicTestKind DynamicTest = 2;`
     * @return Whether the dynamicTest field is set.
     */
    public fun hasDynamicTest(): kotlin.Boolean {
      return _builder.hasDynamicTest()
    }

    /**
     * ```
     * MISSING DOCUMENTATION!!!
     * ```
     *
     * `.commonmodule.PhaseDPS Pos = 3;`
     */
    public var pos: openfmb.commonmodule.PhaseDPS
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
     * `.commonmodule.PhaseDPS Pos = 3;`
     */
    public fun clearPos() {
      _builder.clearPos()
    }
    /**
     * ```
     * MISSING DOCUMENTATION!!!
     * ```
     *
     * `.commonmodule.PhaseDPS Pos = 3;`
     * @return Whether the pos field is set.
     */
    public fun hasPos(): kotlin.Boolean {
      return _builder.hasPos()
    }

    /**
     * ```
     * Fault latch: LT01=51A OR 51B OR 51C
     * ```
     *
     * `.commonmodule.ACD ProtectionPickup = 4;`
     */
    public var protectionPickup: openfmb.commonmodule.ACD
      @JvmName("getProtectionPickup")
      get() = _builder.getProtectionPickup()
      @JvmName("setProtectionPickup")
      set(value) {
        _builder.setProtectionPickup(value)
      }
    /**
     * ```
     * Fault latch: LT01=51A OR 51B OR 51C
     * ```
     *
     * `.commonmodule.ACD ProtectionPickup = 4;`
     */
    public fun clearProtectionPickup() {
      _builder.clearProtectionPickup()
    }
    /**
     * ```
     * Fault latch: LT01=51A OR 51B OR 51C
     * ```
     *
     * `.commonmodule.ACD ProtectionPickup = 4;`
     * @return Whether the protectionPickup field is set.
     */
    public fun hasProtectionPickup(): kotlin.Boolean {
      return _builder.hasProtectionPickup()
    }

    /**
     * ```
     * Protection mode such as a group setting or pre-defined curve profile. It is usually pre-defined
     * by a circuit segment service.
     * ```
     *
     * `.commonmodule.StatusINS ProtectionMode = 5;`
     */
    public var protectionMode: openfmb.commonmodule.StatusINS
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
     * `.commonmodule.StatusINS ProtectionMode = 5;`
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
     * `.commonmodule.StatusINS ProtectionMode = 5;`
     * @return Whether the protectionMode field is set.
     */
    public fun hasProtectionMode(): kotlin.Boolean {
      return _builder.hasProtectionMode()
    }

    /**
     * ```
     * Reclose enabled
     * ```
     *
     * `.commonmodule.PhaseSPS RecloseEnabled = 6;`
     */
    public var recloseEnabled: openfmb.commonmodule.PhaseSPS
      @JvmName("getRecloseEnabled")
      get() = _builder.getRecloseEnabled()
      @JvmName("setRecloseEnabled")
      set(value) {
        _builder.setRecloseEnabled(value)
      }
    /**
     * ```
     * Reclose enabled
     * ```
     *
     * `.commonmodule.PhaseSPS RecloseEnabled = 6;`
     */
    public fun clearRecloseEnabled() {
      _builder.clearRecloseEnabled()
    }
    /**
     * ```
     * Reclose enabled
     * ```
     *
     * `.commonmodule.PhaseSPS RecloseEnabled = 6;`
     * @return Whether the recloseEnabled field is set.
     */
    public fun hasRecloseEnabled(): kotlin.Boolean {
      return _builder.hasRecloseEnabled()
    }

    /**
     * ```
     * Reclose mode such idle, cycling and lockout.
     * ```
     *
     * `.commonmodule.PhaseRecloseAction ReclosingAction = 7;`
     */
    public var reclosingAction: openfmb.commonmodule.PhaseRecloseAction
      @JvmName("getReclosingAction")
      get() = _builder.getReclosingAction()
      @JvmName("setReclosingAction")
      set(value) {
        _builder.setReclosingAction(value)
      }
    /**
     * ```
     * Reclose mode such idle, cycling and lockout.
     * ```
     *
     * `.commonmodule.PhaseRecloseAction ReclosingAction = 7;`
     */
    public fun clearReclosingAction() {
      _builder.clearReclosingAction()
    }
    /**
     * ```
     * Reclose mode such idle, cycling and lockout.
     * ```
     *
     * `.commonmodule.PhaseRecloseAction ReclosingAction = 7;`
     * @return Whether the reclosingAction field is set.
     */
    public fun hasReclosingAction(): kotlin.Boolean {
      return _builder.hasReclosingAction()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun openfmb.commonmodule.StatusAndEventXCBR.copy(block: openfmb.commonmodule.StatusAndEventXCBRKt.Dsl.() -> kotlin.Unit): openfmb.commonmodule.StatusAndEventXCBR =
  openfmb.commonmodule.StatusAndEventXCBRKt.Dsl._create(this.toBuilder()).apply { block() }._build()

public val openfmb.commonmodule.StatusAndEventXCBROrBuilder.logicalNodeForEventAndStatusOrNull: openfmb.commonmodule.LogicalNodeForEventAndStatus?
  get() = if (hasLogicalNodeForEventAndStatus()) getLogicalNodeForEventAndStatus() else null

public val openfmb.commonmodule.StatusAndEventXCBROrBuilder.dynamicTestOrNull: openfmb.commonmodule.ENS_DynamicTestKind?
  get() = if (hasDynamicTest()) getDynamicTest() else null

public val openfmb.commonmodule.StatusAndEventXCBROrBuilder.posOrNull: openfmb.commonmodule.PhaseDPS?
  get() = if (hasPos()) getPos() else null

public val openfmb.commonmodule.StatusAndEventXCBROrBuilder.protectionPickupOrNull: openfmb.commonmodule.ACD?
  get() = if (hasProtectionPickup()) getProtectionPickup() else null

public val openfmb.commonmodule.StatusAndEventXCBROrBuilder.protectionModeOrNull: openfmb.commonmodule.StatusINS?
  get() = if (hasProtectionMode()) getProtectionMode() else null

public val openfmb.commonmodule.StatusAndEventXCBROrBuilder.recloseEnabledOrNull: openfmb.commonmodule.PhaseSPS?
  get() = if (hasRecloseEnabled()) getRecloseEnabled() else null

public val openfmb.commonmodule.StatusAndEventXCBROrBuilder.reclosingActionOrNull: openfmb.commonmodule.PhaseRecloseAction?
  get() = if (hasReclosingAction()) getReclosingAction() else null

