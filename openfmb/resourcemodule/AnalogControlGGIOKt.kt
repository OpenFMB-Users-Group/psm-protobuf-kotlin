// Generated by the protocol buffer compiler. DO NOT EDIT!
// source: resourcemodule/resourcemodule.proto

// Generated files should ignore deprecation warnings
@file:Suppress("DEPRECATION")
package openfmb.resourcemodule;

@kotlin.jvm.JvmName("-initializeanalogControlGGIO")
public inline fun analogControlGGIO(block: openfmb.resourcemodule.AnalogControlGGIOKt.Dsl.() -> kotlin.Unit): openfmb.resourcemodule.AnalogControlGGIO =
  openfmb.resourcemodule.AnalogControlGGIOKt.Dsl._create(openfmb.resourcemodule.AnalogControlGGIO.newBuilder()).apply { block() }._build()
/**
 * ```
 * LN: Generic process I/O   Name: GGIO
 * ```
 *
 * Protobuf type `resourcemodule.AnalogControlGGIO`
 */
public object AnalogControlGGIOKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: openfmb.resourcemodule.AnalogControlGGIO.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: openfmb.resourcemodule.AnalogControlGGIO.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): openfmb.resourcemodule.AnalogControlGGIO = _builder.build()

    /**
     * ```
     * UML inherited base object
     * ```
     *
     * `.commonmodule.LogicalNode logicalNode = 1 [(.uml.option_parent_message) = true];`
     */
    public var logicalNode: openfmb.commonmodule.LogicalNode
      @JvmName("getLogicalNode")
      get() = _builder.getLogicalNode()
      @JvmName("setLogicalNode")
      set(value) {
        _builder.setLogicalNode(value)
      }
    /**
     * ```
     * UML inherited base object
     * ```
     *
     * `.commonmodule.LogicalNode logicalNode = 1 [(.uml.option_parent_message) = true];`
     */
    public fun clearLogicalNode() {
      _builder.clearLogicalNode()
    }
    /**
     * ```
     * UML inherited base object
     * ```
     *
     * `.commonmodule.LogicalNode logicalNode = 1 [(.uml.option_parent_message) = true];`
     * @return Whether the logicalNode field is set.
     */
    public fun hasLogicalNode(): kotlin.Boolean {
      return _builder.hasLogicalNode()
    }

    /**
     * ```
     * (controllable) Value of the generic controllable analogue output setpoint <i>n</i>. Analog value
     * (MX) feeds back the setpoint of the output.
     * ```
     *
     * `.commonmodule.ControlAPC AnOut = 2 [(.uml.option_required_field) = true, (.uml.option_multiplicity_min) = 1];`
     */
    public var anOut: openfmb.commonmodule.ControlAPC
      @JvmName("getAnOut")
      get() = _builder.getAnOut()
      @JvmName("setAnOut")
      set(value) {
        _builder.setAnOut(value)
      }
    /**
     * ```
     * (controllable) Value of the generic controllable analogue output setpoint <i>n</i>. Analog value
     * (MX) feeds back the setpoint of the output.
     * ```
     *
     * `.commonmodule.ControlAPC AnOut = 2 [(.uml.option_required_field) = true, (.uml.option_multiplicity_min) = 1];`
     */
    public fun clearAnOut() {
      _builder.clearAnOut()
    }
    /**
     * ```
     * (controllable) Value of the generic controllable analogue output setpoint <i>n</i>. Analog value
     * (MX) feeds back the setpoint of the output.
     * ```
     *
     * `.commonmodule.ControlAPC AnOut = 2 [(.uml.option_required_field) = true, (.uml.option_multiplicity_min) = 1];`
     * @return Whether the anOut field is set.
     */
    public fun hasAnOut(): kotlin.Boolean {
      return _builder.hasAnOut()
    }

    /**
     * ```
     * Phase code
     * ```
     *
     * `.commonmodule.Optional_PhaseCodeKind Phase = 3;`
     */
    public var phase: openfmb.commonmodule.Optional_PhaseCodeKind
      @JvmName("getPhase")
      get() = _builder.getPhase()
      @JvmName("setPhase")
      set(value) {
        _builder.setPhase(value)
      }
    /**
     * ```
     * Phase code
     * ```
     *
     * `.commonmodule.Optional_PhaseCodeKind Phase = 3;`
     */
    public fun clearPhase() {
      _builder.clearPhase()
    }
    /**
     * ```
     * Phase code
     * ```
     *
     * `.commonmodule.Optional_PhaseCodeKind Phase = 3;`
     * @return Whether the phase field is set.
     */
    public fun hasPhase(): kotlin.Boolean {
      return _builder.hasPhase()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun openfmb.resourcemodule.AnalogControlGGIO.copy(block: openfmb.resourcemodule.AnalogControlGGIOKt.Dsl.() -> kotlin.Unit): openfmb.resourcemodule.AnalogControlGGIO =
  openfmb.resourcemodule.AnalogControlGGIOKt.Dsl._create(this.toBuilder()).apply { block() }._build()

public val openfmb.resourcemodule.AnalogControlGGIOOrBuilder.logicalNodeOrNull: openfmb.commonmodule.LogicalNode?
  get() = if (hasLogicalNode()) getLogicalNode() else null

public val openfmb.resourcemodule.AnalogControlGGIOOrBuilder.anOutOrNull: openfmb.commonmodule.ControlAPC?
  get() = if (hasAnOut()) getAnOut() else null

public val openfmb.resourcemodule.AnalogControlGGIOOrBuilder.phaseOrNull: openfmb.commonmodule.Optional_PhaseCodeKind?
  get() = if (hasPhase()) getPhase() else null

